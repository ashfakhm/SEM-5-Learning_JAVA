class A {
    int x;
    int y;

    A(int x, int y){
        this.x = x;
        this.y = y;
    }

    int greatest(){
        return (x > y) ? x : y;
    }
}

class B extends A {
    int z;

    B(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    int greatest() {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }
}
public class thirtyeight {

    public static void main(String[] args) {
        
        A a=new A(5,10);
        B b=new B(10, 5 ,25);
        A z;
        z=a;
        System.err.println(z.greatest()+" is Greatest");
        z=b;
        System.out.println(z.greatest()+" is greater");

    }
}