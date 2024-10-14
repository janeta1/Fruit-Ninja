import fruitNinjaHelper.cs3331Fruit;

public class Fruits extends cs3331Fruit implements Choppable{

    public Fruits(String url) {
        this.setImage(url);
        this.wash();
        this.ripen();
    }

    @Override
    public void moveChoppableObject() {
        super.moveFruit();
    }

    @Override
    public void chopChoppableObject() {
        super.chopGraphically();
        super.splash();
    }

}
