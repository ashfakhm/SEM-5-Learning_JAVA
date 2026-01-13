class rectangle{
    int length;
    int breadth;
    rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    int area(){
        return length*breadth;
    }
    void compareArea(rectangle r){

        int area1=this.area();
        int area2=r.area();
        if(area1>area2)
        {
            System.out.println("First rectangle have bigger Area");
        }
        else if(area1<area2){
            System.out.println("Second rectangle has greater Area");
        }
        else
        {
            System.out.println("Both Have Same Area");
        }

    }
}
class compArea{
    public static void main(String args[]) {
        rectangle r1 = new rectangle(5, 3);
        rectangle r2 = new rectangle(4, 3);
        r1.compareArea(r2);
    }
}
