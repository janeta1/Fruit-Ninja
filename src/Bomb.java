import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements Objects{

    public Bomb() {
        this.setImage();
    }
    @Override
    public void moveObject() {
        super.moveBomb();
    }

    @Override
    public void chopObject() {
        super.explode();
    }
    
}
