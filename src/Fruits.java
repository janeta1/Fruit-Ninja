import fruitNinjaHelper.cs3331Fruit;

public class Fruits extends cs3331Fruit implements Choppable {
    private int indScore = 0; // integer that will hold the individual score for an object

    /**
     * Constructor for the class
     * @param url - string that holds the path to the image of the fruit
     * @param indScore - individual score of each fruit
     */
    public Fruits(String url, int indScore) {
        this.indScore = indScore;
        this.setImage(url);

        // washing and ripening the fruit
        this.wash();
        this.ripen();
    }

    /**
     * Moves the fruit accross the frame
     */
    @Override
    public void moveChoppableObject() {
        super.moveFruit();
    }

    /**
     * Chops the fruit and creates a splash
     */
    @Override
    public void chopChoppableObject() {
        super.chopGraphically();
        super.splash();
    }

    /**
     * Returns the individual score of each fruit
     */
    @Override
    public int getScore() {
        return this.indScore;
    }

}
