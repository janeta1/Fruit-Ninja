import fruitNinjaHelper.cs3331Blade;
import fruitNinjaHelper.cs3331FruitNinjaGame;
import fruitNinjaHelper.cs3331ScoreController;
import java.lang.Math;
import fruitNinjaHelper.Constants;

public class Game extends cs3331FruitNinjaGame {
    Choppable myObject;
    cs3331Blade myBlade;
    cs3331ScoreController score;
    int indScore = 0;

    // You may need to add constructor
    public Game(cs3331ScoreController score) {
        this.score = score;
        myBlade = new cs3331Blade("myBlade");
        this.addBlade(myBlade);
        
    }

    public void updateChoppable(Choppable object) {

        object.moveChoppableObject();
        if(myBlade.checkIntersection(object)) {
            object.chopChoppableObject();
            score.addToScore(indScore);
        }

    }

    @Override
    public Choppable launchItem() {
        int rand = (int) (Math.random() * 5) + 1;

        switch (rand) {
            case 1:
                myObject = new Fruits(Constants.APPLE_PATH);
                indScore = 2;
                return myObject;

            case 2:
                myObject = new Fruits(Constants.LEMON_PATH);
                indScore = 2;
                return myObject;
            case 3:
                myObject = new Fruits(Constants.PEACH_PATH);
                indScore = 3;
                return myObject;
            case 4:
                myObject = new Fruits(Constants.PEAR_PATH);
                indScore = 5;
                return myObject;
            case 5:
                myObject = new Bomb();
                return myObject;

        }

        return null;
    }

    // Do not modify anything below this line
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }
}