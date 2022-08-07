public interface movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();

}
public class MoveblePoint implements movable{
    default int x;
    default int y;
    default int xSpeed;
    default int ySpeed;

 public MoveblePoint(int x, int y, int xSpeed, int ySpeed){

 }

    @Override
    public String toString() {
        return "MoveblePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
public class MovableCircle{
    int radius;

public void MovableCircle(int x,int y,int xSpeed, int ySpeed,int radius)

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                '}';
    }


    public void moveUp() {

    }


    public void moveDown() {

    }


    public void moveLeft() {

    }

    public void moveRight() {

    }
}