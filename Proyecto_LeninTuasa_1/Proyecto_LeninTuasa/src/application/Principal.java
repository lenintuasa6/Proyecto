package application;

import com.chat.dominio.User;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application {
	/**
	 * 
	 */
	private User user;
	private BorderPane root = new BorderPane();

	public static void main(String[] args) {
		launch(args);
	}

	public Principal(User usuario) {
		user = usuario;
	}

	public Principal() {
	}

	/**
	 * Create the frame.
	 */

	@Override
	public void start(Stage primaryStage) {

		ChatsPersonalesView chats_obj = new ChatsPersonalesView(user);
		Scene scene;

		root.setLeft(chats_obj.ChatsPers());
		scene = new Scene(root, 1300, 400);
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Runnable updater = new Runnable() {

					@Override
					public void run() {
						root.setCenter(chats_obj.getBp());
						root.setLeft(chats_obj.ChatsPers());
					}
				};

				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
					}

					// UI update is run on the Application thread
					Platform.runLater(updater);
				}
			}
		});
		thread.setDaemon(true);
        thread.start();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public BorderPane getRoot() {
		return root;
	}

	public void setRoot(BorderPane root) {
		this.root = root;
	}

}
