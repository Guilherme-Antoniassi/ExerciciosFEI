
package aula03ex02;


public class Swapper {
    
   private  double x,y;
   
   public void setX(double x){
       this.x=x;
   }
   
   public void setY(double y){
       this.y=y;
   }
   
   public double getX(){
       return x;
   }
    
   public double getY(){
       return y;
   }
   
   public void swap(){
       double aux;
       aux=x;
       x=y;
       y=x;
   }
    
}
