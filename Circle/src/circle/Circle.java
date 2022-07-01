/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;
import java.util.*;
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float r,a,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of radius");
        r=in.nextFloat();
        a=(float) (3.141*r*r);
        c= (float) (2*3.141*r);
        System.out.println("Circumferance = "+ c+" Area = "+a);
                }
    
}
