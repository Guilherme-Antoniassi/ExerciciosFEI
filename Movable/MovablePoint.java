
package aula06ex04;

/**
 *
 * @author unifgaraujo
 */
public class MovablePoint implements Movable{
    
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "X="+" "+this.x+"Y="+this.y+"X Speed="+this.xSpeed+"Y speed"+this.ySpeed;
    }

    @Override
    public void moveUp() {
     this.y++;
    }

    @Override
    public void moveDown() {
    this.y--;      
    }

    @Override
    public void moveLeft() {
       this.x--;
    }

    @Override
    public void moveRight() {
    this.x++;
    }
    
  
}
