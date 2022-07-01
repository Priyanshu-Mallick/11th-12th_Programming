
package inheritancepractical1;


public class InheritancePractical1 {
    
    public static void main(String[] args) {
        class Complex{
            int real;
            int img;
           private  void setData(int r,int i){
                real=r;
                img=i;
            }
            class Complex1{
                
            }
               void displayData(){
                   System.out.println(real +""+img );
              
            }
            
        }
        
    }
    
}
