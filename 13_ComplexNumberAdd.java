class complex
{
int real;
int imag;
complex(){
    real=0;
    imag=0;
}
complex(int x ,int y)
{
    real=x;
    imag=y;
}
complex add(complex c){
    complex temp=new complex();
    temp.real=this.real+c.real;
    temp.imag=this.imag+c.imag;
    return temp;
}
void display()
{
    System.out.println("Result Is "+real+" + "+imag+"i");
}
}

class complexAdd{

    public static void main(String args[]) {
        complex ob1=new complex(5,6);
        complex ob2=new complex(2,3);
        complex ob3=new complex();
        ob3=ob1.add(ob2);
        ob3.display();
        
    }
}