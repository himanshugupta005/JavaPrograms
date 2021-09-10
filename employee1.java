class employees {
    String name;
    int sal;
    int hours;
    employees(){
        name="";
        sal=0;
        hours=0;
    }
    employees(String n, int s, int hrs){
        this.name=n;
        this.sal=s;
        this.hours=hrs;
    }
    void getInfo(int s, int hrs){
        this.sal=s;
        this.hours=hrs;
    }
    void AddSal(){
        if(sal<500);
        sal=sal+10;
        System.out.print("final salary: ");
        System.out.println(sal);
    }
    void AddWork(){
        if(hours>6);
        sal=sal+5;
        System.out.print("final salary: ");
        System.out.println(sal);
    }
}


public class employee1 {
        public static void main(String[]args){
        employees Emp=new employees();
        Emp.getInfo(300, 8);
        Emp.AddWork();
        Emp.AddSal();    
    }
}

