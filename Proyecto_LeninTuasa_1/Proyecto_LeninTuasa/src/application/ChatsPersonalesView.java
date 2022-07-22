package application;

import java.util.List;

import com.chat.dominio.User;
import com.chat.repository.MessageRepository;
import com.chat.repository.UserRepository;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;

public class ChatsPersonalesView {

	User usuario;
	private BorderPane bp;
	
	public ChatsPersonalesView(User user) {
		usuario = user;
	}

	public VBox ChatsPers() {
		VBox paneChats = new VBox();
		HBox hbox = new HBox();
		StackPane stack = new StackPane();
		UserRepository repoUser = new UserRepository();
		MessageRepository repomsg = new MessageRepository();

		paneChats.setStyle("-fx-background-color: #ddd;");

		hbox.setPadding(new Insets(9, 6, 9, 6));
		hbox.setSpacing(10);
		hbox.setStyle("-fx-background-color: #6ba1b9;");

		Image imageUser = new Image(getClass().getResourceAsStream(usuario.getPhoto()));// *
		ImageView imgUserprofile = new ImageView(imageUser);
		imgUserprofile.setFitWidth(40);
		imgUserprofile.setFitHeight(40);

		Rectangle clip = new Rectangle(imgUserprofile.getFitWidth(), imgUserprofile.getFitHeight());
		clip.setArcWidth(100);
		clip.setArcHeight(100);
		clip.setStrokeType(StrokeType.INSIDE);
		imgUserprofile.setClip(clip);

		stack.getChildren().add(imgUserprofile);

		Image image = new Image(getClass().getResourceAsStream("/img/icons8-comments-48.png"));
		ImageView imageView_convers = new ImageView(image);
		imageView_convers.setFitWidth(24);
		imageView_convers.setFitHeight(24);

		Image image_menu = new Image(getClass().getResourceAsStream("/img/icons8-menu-vertical-24.png"));
		ImageView imageView_menu = new ImageView(image_menu);

		StackPane stack_icon = new StackPane();
		stack_icon.getChildren().addAll(imageView_convers, imageView_menu);
		StackPane.setMargin(imageView_menu, new Insets(0, 0, 0, 50));
		StackPane.setMargin(imageView_convers, new Insets(0, 35, 0, 0));

		hbox.getChildren().add(stack);
		Region spacer = new Region();
		HBox.setHgrow(spacer, Priority.ALWAYS);
		hbox.getChildren().add(spacer);
		hbox.getChildren().add(stack_icon);

		HBox buscar = new HBox();
		buscar.setPadding(new Insets(5, 2, 5, 2));
		buscar.setSpacing(10);

		Image image_search = new Image(getClass().getResourceAsStream("/img/icons8-search-24.png"));
		ImageView imageView_search = new ImageView(image_search);
		imageView_search.setFitWidth(24);
		imageView_search.setFitHeight(24);

		TextField buscar_text = new TextField();
		buscar_text.setPromptText("Busca un chat o inicia uno nuevo");
		buscar_text.setFocusTraversable(false);
		buscar_text.setStyle("-fx-background-color: #a9a9a9 , white , white;");
		buscar_text.setMinWidth(250);

		buscar.getChildren().addAll(imageView_search, buscar_text);

		VBox chats = new VBox();
		chats.setStyle("-fx-background-color: #fdf5f0;");

		Pane user1_pane = new Pane();
		List<User> listUsers = repoUser.getUsers();
		for (User user : listUsers) {
			if (user.getId() != usuario.getId()) {
				user1_pane = chatsUser(user.getPhoto(), user.getFirstName() + " " + user.getLastName(), repomsg.getLastMessage(usuario.getUserName(), user.getUserName()).getContent(), "14:20");
				chats.getChildren().add(user1_pane);
				
				user1_pane.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

					@Override
					public void handle(MouseEvent event) {
						Conversacion conver = new Conversacion(user, usuario);
						bp = conver.Convers();
					}
				});
			}
		}
		ScrollPane scrollChats = new ScrollPane();
		scrollChats.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		scrollChats.setContent(chats);
		scrollChats.setFitToWidth(true);

		paneChats.setFillWidth(true);
		paneChats.getChildren().addAll(hbox, buscar, scrollChats);
		return paneChats;
	}

	Pane chatsUser(String userPic, String nombre, String lastmsg, String hora) {
		Pane chats = new Pane();

		Image imgUser = new Image(getClass().getResourceAsStream(userPic));
		ImageView imgUserp = new ImageView(imgUser);
		imgUserp.setFitWidth(40);
		imgUserp.setFitHeight(40);
		imgUserp.setLayoutX(16.0);
		imgUserp.setLayoutY(25.0);

		Rectangle clip = new Rectangle(imgUserp.getFitWidth(), imgUserp.getFitHeight());
		clip.setArcWidth(70);
		clip.setArcHeight(70);
		imgUserp.setClip(clip);

		Label lblNombre = new Label(nombre);
		lblNombre.setLayoutX(70.0);
		lblNombre.setLayoutY(25.0);
		lblNombre.setFont(new Font("Calibri Bold", 15.0));

		Label lblLastmsg = new Label(lastmsg);
		lblLastmsg.setLayoutX(70.0);
		lblLastmsg.setLayoutY(45.0);
		lblLastmsg.setFont(new Font("Calibri", 13.0));

		Label lblHora = new Label(hora);
		lblHora.setLayoutX(280.0);
		lblHora.setLayoutY(25.0);

		chats.getChildren().addAll(imgUserp, lblNombre, lblLastmsg, lblHora);
		chats.setPadding(new Insets(9, 6, 9, 6));
		chats.setStyle("-fx-border-color: #9c9c9c; -fx-border-width: 0 -1 0.5 -1;");
		return chats;
	}

	public BorderPane getBp() {
		return bp;
	}

	public void setBp(BorderPane bp) {
		this.bp = bp;
	}
	
	
}
