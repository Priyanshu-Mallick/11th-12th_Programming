/*
 Author Name- Diptiranjan Sahoo
Roll_No- IS19-077
Guided  By- Biswaranjan Bhola
 */
package primenumber2;
import java.util.*;
public class PrimeNumber2 {
     
                  public static void main(String[] args) {
                        int n,a,b;
                        Scanner in=new Scanner(System.in);
                        System.out.println("Enter a number");
                        n=in.nextInt();
                        a=1;
                        b=0;
                        while(a<=n)
                                    {
                                          if(n%a==0){
                                                              b=b+1;
                                                         }
                                         a=a+1;           
                                     }
                    if(b==2){
                                System.out.println(n+" is a Prime Number ");
                                       }
        else{
             System.out.println(n+" is Not a Prime Number ");
                 }
        }   
}
