public class rectangle {
    int length;
    int breadth;

    rectangle(int l,int b){
        this.length=l;
        this.breadth=b;

    }
public int getArea(){
    return this.length*this.breadth;
    
}
} class rectangle1{
    public static void main(String[]args){
        rectangle obj=new rectangle(4,5);
        rectangle obj1=new rectangle(5,8);
        
        System.out.println(obj.getArea());
        System.out.println(obj1.getArea());

    }
}

