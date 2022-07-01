
package binary;

import java.util.*;
public class Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int a, b,c,d;
                String e; 
                Scanner in=new Scanner(System.in);
                System.out.println("enter a number");
                a=in.nextInt();
                c=2;
                 d=1;
                while(d!=0){
                     d=a/c;  
                    b=a%c;
                System.out.print(b);
                  c=c+1;
                }
              
    }
    
}
