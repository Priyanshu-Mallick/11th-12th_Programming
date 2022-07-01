/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping;

import java.util.*;
public class Swapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter two numbers");
       x=in.nextInt();
       y=in.nextInt();
       System.out.println("Before swapping x = "+x+" , y= "+y);
       z=x;
       x=y;
       y=z;
       System.out.println("After swapping x= "+x+" , y= "+y);
       
    }
    
}
