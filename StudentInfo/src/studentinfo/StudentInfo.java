/*
Author Name: Diptiranjan Sahoo
Roll no: IS -19-077
Guided by: Biswaranjan Bhola
**/
package studentinfo; class Student
{
int roll,pm,cm,im,mm,milm,tot; String name;
char sec,div; float percentage;
public void setData(int r,String n,char s)
{
roll=r; name=n; sec=s;
}
public void setMark(int p,int c,int i,int m,int mi)
{
pm=p; cm=c; im=i; mm=m; milm=mi;
}
public void getTotalmark()
{
tot=pm+cm+im+mm+milm; System.out.print("Totalmark :"+tot); System.out.println();
}
public void getPercentage()
{
percentage=tot/5.0f; System.out.print("Percentage :"+percentage); System.out.println();
}
public void getDivision()
{
if(percentage>=60)
{
System.out.println("1st Division");
}
else if(percentage>=40)
{
System.out.println("2nd Division");
}
else if(percentage>=30)
{
System.out.println("3rd Division");
}
else
{
System.out.println("Fail");
}
}
public void displayData()
{
System.out.println("ROLL :"+roll); 
System.out.println("NAME :"+name); 
System.out.println("SECTION :"+sec); 
System.out.println("PHYSICS MARK :"+pm); 
System.out.println("CHEMISTRY MARK :"+cm); 
System.out.println("IT MARK :"+im);
System.out.println("MATH MARK :"+mm); 
System.out.println("MIL MARK :"+milm);
System.out.println();
}
}
public class StudentInfo {

public static void main(String[] args) {

Student x=new Student();
x.setData(1,"Anshu",'A');
x.setMark(70,30,45,65,75);
x.displayData(); 
x.getTotalmark(); x.getPercentage(); 
x.getDivision();
System.out.println();
}

}
