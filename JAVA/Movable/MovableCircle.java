
package aula06ex04;

/**
 *
 * @author unifgaraujo
 */
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "radius: "+this.radius+ this.center.toString();
    }

    @Override
    public void moveUp() {
    this.center.moveUp();
    }

    @Override
    public void moveDown() {
      this.center.moveDown();
    }

    @Override
    public void moveLeft() {
      this.center.moveLeft();
    }

    @Override
    public void moveRight() {
       this.center.moveRight();
    }
    
    
    
    
}
