package application;

import java.util.Date;

import com.chat.dominio.Message;
import com.chat.dominio.User;
import com.chat.repository.MessageRepository;
import com.chat.repository.UserRepository;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Conversacion {
	User usuario;
	static MessageRepository repo = new MessageRepository();
	UserRepository repoUser = new UserRepository();
	User idUserto;
	int idLast = 0;
	static Message msgnew;
	static ObservableList<Message> repoList = FXCollections.observableArrayList();

	public Conversacion(User UserTo, User UserFrom) {
		super();
		// TODO Auto-generated constructor stub
		idUserto = UserTo;
		usuario = UserFrom;
	}

	public BorderPane Convers() {

		HBox top_bar = new HBox();
		top_bar.setAlignment(Pos.CENTER_LEFT);
		top_bar.setPadding(new Insets(9, 6, 9, 6));
		top_bar.setSpacing(10);
		top_bar.setStyle("-fx-background-color: #6ba1b9;");

		Image image = new Image(getClass().getResourceAsStream(idUserto.getPhoto()));
		ImageView imgV_foto = new ImageView(image);
		imgV_foto.setFitWidth(40);
		imgV_foto.setFitHeight(40);

		Rectangle clip = new Rectangle(imgV_foto.getFitWidth(), imgV_foto.getFitHeight());
		clip.setArcWidth(100);
		clip.setArcHeight(100);
		clip.setStrokeType(StrokeType.INSIDE);
		imgV_foto.setClip(clip);

		Label lblNombreUserChat = new Label(idUserto.getFirstName() + " " + idUserto.getLastName());
		lblNombreUserChat.setFont(new Font("arial black", 17.0));
		lblNombreUserChat.setStyle("-fx-text-fill: white;");

		top_bar.getChildren().addAll(imgV_foto, lblNombreUserChat);

		VBox msgListTo = new VBox();

		User userFrom = repoUser.getUserByUserName(usuario.getUserName());
		// Logica de mensaje
		repoList = repo.getMessage(userFrom.getUserName(), idUserto.getUserName());
		for (Message message : repoList) {
			if (message.getFrom().getUserName() == userFrom.getUserName()) {
				HBox hbox_msg = new HBox();
				hbox_msg.setAlignment(Pos.CENTER_RIGHT);
				hbox_msg.setPadding(new Insets(5, 5, 5, 10));

				Text text = new Text(message.getContent());
				TextFlow textFlow = new TextFlow(text);
				textFlow.setStyle("-fx-color: rgb(239, 242, 255);" + "-fx-background-color: rgb(15, 125, 242);"
						+ "-fx-background-radius: 20px;" + "-fx-font-size: 15px;");
				textFlow.setPadding(new Insets(5, 10, 5, 10));
				text.setFill(Color.color(0.914, 0.945, 0.996));

				hbox_msg.getChildren().add(textFlow);
				msgListTo.getChildren().add(hbox_msg);

				idLast = message.getId();
			} else {
				HBox hbox_msg = new HBox();
				hbox_msg.setAlignment(Pos.CENTER_LEFT);
				hbox_msg.setPadding(new Insets(5, 5, 5, 10));

				Text text = new Text(message.getContent());
				TextFlow textFlow = new TextFlow(text);
				textFlow.setStyle("-fx-color: rgb(239, 242, 255);" + "-fx-background-color: rgb(15, 125, 242);"
						+ "-fx-background-radius: 20px;" + "-fx-font-size: 15px;");
				textFlow.setPadding(new Insets(5, 10, 5, 10));
				text.setFill(Color.color(0.914, 0.945, 0.996));

				hbox_msg.getChildren().add(textFlow);
				msgListTo.getChildren().add(hbox_msg);
				idLast = message.getId();

			}
		}

		HBox bottom_bar = new HBox();
		bottom_bar.setAlignment(Pos.CENTER_LEFT);
		bottom_bar.setPadding(new Insets(9, 6, 9, 6));
		bottom_bar.setSpacing(20);
		bottom_bar.setStyle("-fx-background-color: #6ba1b9;");

		Image icon = new Image(getClass().getResourceAsStream("/img/icons8-star-24.png"));
		ImageView imgV_icon = new ImageView(icon);

		TextField txtSendmsg = new TextField();
		txtSendmsg.setPromptText("Escribe un mensaje aqui");
		txtSendmsg.setPadding(new Insets(9, 6, 9, 6));
		txtSendmsg.setPrefWidth(999);
		txtSendmsg.setStyle("-fx-background-radius: 5, 8;");

		Image iconSend = new Image(getClass().getResourceAsStream("/img/icons8-send-24.png"));
		Button btn_iconSend = new Button();
		btn_iconSend.setGraphic(new ImageView(iconSend));

		bottom_bar.getChildren().add(imgV_icon);
		bottom_bar.getChildren().add(txtSendmsg);
		bottom_bar.getChildren().add(btn_iconSend);

		btn_iconSend.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				HBox LastMssg = new HBox();
				LastMssg.setAlignment(Pos.CENTER_RIGHT);
				LastMssg.setPadding(new Insets(5, 5, 5, 10));

				Text text = new Text(txtSendmsg.getText());
				TextFlow textFlow = new TextFlow(text);
				textFlow.setStyle("-fx-color: rgb(239, 242, 255);" + "-fx-background-color: rgb(15, 125, 242);"
						+ "-fx-background-radius: 20px;" + "-fx-font-size: 15px;");
				textFlow.setPadding(new Insets(5, 10, 5, 10));
				text.setFill(Color.color(0.914, 0.945, 0.996));

				LastMssg.getChildren().add(textFlow);
				msgListTo.getChildren().add(LastMssg);

				msgnew = new Message(idLast + 1, userFrom, idUserto, String.valueOf(new Date().getTime()),
						txtSendmsg.getText());
				repoList.add(msgnew);
				repo.getMessages().add(msgnew);

				txtSendmsg.clear();
			}
		});

		ScrollPane scrollChat = new ScrollPane();
		scrollChat.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		scrollChat.setContent(msgListTo);
		scrollChat.setFitToWidth(true);

		BorderPane root = new BorderPane();
		root.setBottom(bottom_bar);
		root.setTop(top_bar);
		root.setCenter(scrollChat);

		// Action Listener

		return root;
	}
}
