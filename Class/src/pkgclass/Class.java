
package pkgclass;
import java.util.*;
public class Class {
    int roll;
    String name;
    char sec;
    public void setData(int r,String n,char s){
        roll=r;
        name=n;
        sec=s; 
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name");
        n=in.next();
        System.out.println("Roll no");
        r= in.nextInt();
        System.out.println("Enter your section");
        
        
         
    }
}
class Mark extends Class{
    int phy;
    int chem;
    int it;
    int math;
    int mil;
    public void setMark(int p,int c,int i,int m,int mi){
        phy =p;
        chem=c;
        it=i;
        math=m;
        mil=mi;
        System.out.println();
                
    }
}