import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Ali on 8/10/2018.
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("BomberMan");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/startmenu.fxml"))));
        stage.show();
    }
}
