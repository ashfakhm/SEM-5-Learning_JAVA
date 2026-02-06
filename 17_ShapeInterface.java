import java.util.*;
interface Shape{
    void area();
}
class Circle implements Shape{
    double radius;

Circle(double radius){
    this.radius=radius;
}
public void area(){
    double area=3.14*radius*radius;
    System.out.println("Area Of Circle: "+area);
}
}
class Sphere implements Shape{
double radius;
Sphere(double radius){
this.radius=radius;
}
public void area()
{
double area=4*3.14*radius*radius;
System.out.println("Area Of Sphere: "+area);
}
}
public class InterfaceDemo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Radius Of The Circle");
        int radius=s.nextInt();
        Circle c=new Circle(radius);
        System.out.println("Enter The Radius of Sphere");
        int sr=s.nextInt();
        Sphere sp = new Sphere(sr);
        c.area();
        sp.area();
        s.close();
    }
}
