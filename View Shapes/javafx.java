import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class javafx extends Application{

    public void start(Stage primarStage){

        Pane stackPane = new Shapes();
        Scene scene = new Scene(stackPane,500,500);

        primarStage.setTitle("View Shapes");

        primarStage.setScene(scene);
        primarStage.show();

    }
    
    public static void main(String[] args) {
        launch (args);
    }

}
