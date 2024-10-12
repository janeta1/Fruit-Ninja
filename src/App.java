import fruitNinjaHelper.cs3331FruitNinjaFrame;
import fruitNinjaHelper.cs3331ScoreController;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public void start(Stage primaryStage) {
        cs3331FruitNinjaFrame frame = new cs3331FruitNinjaFrame(primaryStage);
        cs3331ScoreController score = new cs3331ScoreController();
        // Your code goes here!!
        Game new_game = new Game(score);
        frame.addGame(new_game);
        frame.setTop(score);
        new_game.startGame();
        
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}