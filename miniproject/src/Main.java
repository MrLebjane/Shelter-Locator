
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		UserInterface root=new UserInterface();
		Scene scene=new Scene(root,800,600);
		//Stage stage=new Stage();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
