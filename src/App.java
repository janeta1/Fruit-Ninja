import fruitNinjaHelper.cs3331FruitNinjaFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public void start(Stage primaryStage) {
        cs3331FruitNinjaFrame frame = new cs3331FruitNinjaFrame(primaryStage); // creating the frame
        Game new_game = new Game(frame); // creating the game

        frame.addGame(new_game); // adding the game to the frame
        new_game.startGame(); // starting the game

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}