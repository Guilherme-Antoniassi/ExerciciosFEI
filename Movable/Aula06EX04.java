
package aula06ex04;

/**
 *
 * @author unifgaraujo
 */
public class Aula06EX04 {

 
    public static void main(String[] args) {
     
        MovablePoint p1=new MovablePoint(0,0,0,0);
        p1.moveUp();
        p1.moveRight();
        System.out.println(p1);
        
        MovableCircle c1=new MovableCircle(10, p1);
        c1.moveRight();
        System.out.println(c1);
    }
    
}
