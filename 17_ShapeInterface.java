import java.util.*;
interface shape{
    void area();
}
class Circle implements shape{
    double radius;

Circle(double radius){
    this.radius=radius;
}
public void area(){
    double area=3.14*radius*radius;
    System.out.println("Area Of Circle: "+area);
}
}
class sphere implements shape{
double radius;
sphere(double radius){
this.radius=radius;
}
public void area()
{
double area=4*3.14*radius*radius;
System.out.println("Area Of Sphere: "+area);
}
}
public class interfacedemo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Radius Of The Circle");
        int radius=s.nextInt();
        Circle c=new Circle(radius);
        System.out.println("Enter The Radius of Sphere");
        int sr=s.nextInt();
        sphere sp = new sphere(sr);
        c.area();
        sp.area();
        s.close();
    }
}
