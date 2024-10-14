import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements Choppable {

    /**
     * Constructor for the class
     */
    public Bomb() {
        this.setImage();
    }

    /**
     * Moves the bomb accross the frame
     */
    @Override
    public void moveChoppableObject() {
        super.moveBomb();
    }

    /**
     * Explodes the bomb when it comes in contact of the blade
     */
    @Override
    public void chopChoppableObject() {
        super.explode();
    }

    /**
     * Returns 0, meaning the score is not incremented when a bomb gets chopped
     */
    @Override
    public int getScore() {
        return 0;
    }

}
