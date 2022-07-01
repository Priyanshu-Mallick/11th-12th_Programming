 
package lcm;

 import java.util.*;
public class LCM {
 
    public static void main(String[] args) {
         int x,y,bx,by;
        
         Scanner in =new Scanner(System.in);
          System.out.println("Enter two number");
          x=in.nextInt();
          y=in.nextInt();
          bx=x;
          by=y;
          while(x!=y)
          {
              if(x>y){
                  y=y+by;
              }
              else{
                  x=x+bx;
              }
              
          }
          System.out.println("LCM of x & y ="+ x);
         
    }
    
}
