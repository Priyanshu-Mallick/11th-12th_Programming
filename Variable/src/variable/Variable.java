/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable;

/**
 *
 * @author hp
 */
class Complex
{
  public    int real;
   public  int img; 
   void setDataint ()
   {
      int r = 10;
       real =r;
      int i =10;
       img=i;
       
   }
 public   void displayData(){
       System.out.println(" Real: "+ real);
       System.out.println("imaginary: "+img);
   }
   
}
public class Variable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Complex  ob1=new Complex();
    Complex ob2=new Complex();
    Complex ob3=new Complex();
    System.out.println("ob1:");
    ob1.displayData();
   System.out.println("ob2:");
    ob2.displayData();
   System.out.println("ob3:");
    ob3.displayData();
   
    }
   
}
