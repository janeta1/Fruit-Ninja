public interface Choppable {
    // Moves the choppable objects accross the frame
    void moveChoppableObject();

    // Chops the choppable object whne it comes in contact with the blade
    void chopChoppableObject();

    // Return the score after copping an object
    int getScore();
}
