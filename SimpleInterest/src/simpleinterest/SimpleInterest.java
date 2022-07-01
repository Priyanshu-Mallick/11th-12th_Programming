/*
Author Name- Pabitra Kumar Nayak
Roll_No- IS19-224
Guided by-  Biswaranjan Bhola
 */
package simpleinterest;
import java.util.*;//Header file attached for Scanner Class
public class SimpleInterest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int I,p,t,r;// variable deslaration
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of  Principa Ammount");
        p=in.nextInt();//read the principal ammount value from the user
        System.out.println("Enter the value of time ");
        t=in.nextInt();//read the  value of time from the user
        System.out.println("Enter the value of rate");
        r=in.nextInt();//read the rate of interest value from the users
        I=p*t*r/100;//Operation to calculate interest
        System.out.println("Simple Interest = "+I);
    }//End of main method
    
}//End of simple interest class
