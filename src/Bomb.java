import fruitNinjaHelper.cs3331Bomb;

public class Bomb extends cs3331Bomb implements Choppable{

    public Bomb() {
        this.setImage();
    }
    @Override
    public void moveChoppableObject() {
        super.moveBomb();
    }

    @Override
    public void chopChoppableObject() {
        super.explode();
    }
    
}
