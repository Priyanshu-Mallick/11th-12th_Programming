/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greaterno2;

import java.util.*;
public class GreaterNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,z;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter three numbers");
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(x>y)
        {
           
        }
         if (x>y){
             if(x>z){
                 System.out.println("Greater number "+x);
                 
             }
             else{
                 System.out.println("Greater number"+z);
             }
             
         }
         else if(y>z){
             System.out.println("Greater number "+y);
         }
         else{
             System.out.println("Greater number "+z);
         }
      
       
    }
    
}
