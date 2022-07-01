/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodd;
import java.util.*;
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int x;
System.out.println("Enter a number to check whether it is even or odd");
Scanner in=new Scanner(System.in);
x=in.nextInt();
if(x%2==0){
    System.out.println(x+" is an  Even number ");     
}
else{
    System.out.println(x +" is an odd number");
}
    }
    
}
