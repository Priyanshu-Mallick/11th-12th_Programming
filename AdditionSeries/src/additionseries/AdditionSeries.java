/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package additionseries;
import java.util.*;
public class AdditionSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the end value");
        a= in.nextInt();
        b=1;
        c=0;
        while(b<=a){
            c=c+b;
            b=b+1;
        }
        
       System.out.println("the sum of the "+a+"  numbers is "+c);
    }
    
}
