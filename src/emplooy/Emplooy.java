package emplooy;

public class Emplooy {
    int Emp_id;
    String ename;
    String depert;
    double salary;
    double bonus;
    boolean resident;
   static int no_of_objects;
    public Emplooy()
    {
        Emp_id=22;
        ename="NO name";
        depert="no assigned yet";
        salary=33;
        bonus=55;
        resident=true;
        no_of_objects++;


    }
    public Emplooy(int idno , String n ){
        Emp_id=idno;
        ename=n;
    }
    public static int getNo_of_objects()
    {
        return no_of_objects;
    }
    public Emplooy(int idno , String n,boolean r ){
       // Emp_id=idno;//
        //ename=n;//
        this (idno,n);
        resident=r;

    }
    public void set_salary (double s){
        salary=s;

    }
    public void set_bonus(double s,double b){
        this.set_salary(s);
        bonus=b;
    }
    public void print_Emp_data()
    {
        System.out.println("ID"+Emp_id);
        System.out.println("name"+ename);
        System.out.println("Depert"+depert);
        System.out.println("Salary"+salary);
        System.out.println("Bonus"+bonus);
        System.out.println("Boolean"+resident);
    }
}
