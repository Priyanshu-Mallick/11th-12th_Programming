/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greaternumber;

import java.util.*;

public class GreaterNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // TODO code application logic here
   int n1,n2;
   Scanner in=new Scanner(System.in);
   System.out.println("Enter two numbers");
   n1=in.nextInt();
   n2=in.nextInt();
   if(n1>n2){
       System.out.println("Greater number is "+n1);
      
   }
   else if (n1!=n2)
   {
       System.out.println("Greater number is "+n2);
       
   }
   else {
       System.out.println("Both  "+n1 +" and " +n2+" are equal " );
       
   }
       }
    
}
