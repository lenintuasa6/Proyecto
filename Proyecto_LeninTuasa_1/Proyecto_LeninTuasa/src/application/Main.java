package application;

import com.chat.dominio.User;
import com.chat.repository.UserRepository;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	private UserRepository repoUser = new UserRepository();
	private User user;

	@Override
	public void start(Stage primaryStage) {
		try {

			VBox vb = new VBox();
			vb.setSpacing(10);
			 
			HBox hb1 = new HBox();
			hb1.setSpacing(10);
			
			Label l1 = new Label();

			l1.setText("User       : ");
			TextField tf = new TextField();
			hb1.getChildren().addAll(l1, tf);

			HBox hb2 = new HBox();
			Label l2 = new Label("Password  : ");
			PasswordField pf = new PasswordField();
			hb2.getChildren().addAll(l2, pf);

			HBox hb3 = new HBox();
			Button b1 = new Button();
			b1.setText("Login");
			Button b2 = new Button("Reset");
			hb3.getChildren().addAll(b1, b2);

			vb.getChildren().addAll(hb1, hb2, hb3);


			Scene scene = new Scene(vb, 300, 100);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

			b2.setOnAction(e -> {
				tf.setText("");
				pf.setText("");
			});

			b1.setOnAction(e -> {
				if ((tf.getText().equals("")) || (pf.getText().equals(""))) {
					System.out.printf("No hay datos agregados\n");
				} else {
					if (repoUser.login(tf.getText(), pf.getText())!= null) {
						
						user = repoUser.login(tf.getText(), pf.getText());
						System.out.printf("Autenticado\n");
						
						Principal princ = new Principal(user);
						Stage stage = new Stage();
						princ.start(stage);
						
						primaryStage.close();

					} else {
						System.out.printf("Error\n");
					}
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static void main(String[] args) {
		launch(args);

	}
}
