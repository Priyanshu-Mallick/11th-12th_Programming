/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;
import java .util.*;
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,r;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number");
        a=in.nextInt();
        b=in.nextInt();
        r=a+b;
        System.out.println("Addition Result= "+r);
    }
    
}
