
class AreaTriangle{
void Area(float a)
{
double Area= (Math.sqrt(3)/4)*a*a;
System.out.println("Area="+Area);
}
void Area(float b,float h)
{
double Area= 0.5*(b*h);
System.out.println("Area="+Area);
}
void Area(float a,float b,float c)
{
double s= (a+b+c)/2;
double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("Area="+Area);
}
}

class findareatriangle{
public static void main(String args[])
{
AreaTriangle A= new AreaTriangle();
A.Area(5);
A.Area(5,6);
A.Area(5,6,7);
}
}
