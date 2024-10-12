import fruitNinjaHelper.cs3331Fruit;

public class Fruits extends cs3331Fruit implements Objects{

    public Fruits(String url) {
        this.setImage(url);
        this.wash();
        this.ripen();
    }

    @Override
    public void moveObject() {
        super.moveFruit();
    }

    @Override
    public void chopObject() {
        super.chopGraphically();
        splash();
    }

}
