package Person;

public class Person {
    String name;
    Double age;
    String address;
    String nationality;
    public Person()
    {}
    public Person(String  n,Double a,String ad,String nat){
        name=n;
        age=a;
        address=ad;
        nationality=nat;
    }
    public void setName(String n){
        name=n;
    }
    public void setAge(Double a){
        age=a;
    }
    public void setAddress(String ad){
        address=ad;
    }
    public void setNationality(String nat){
        nationality=nat;
    }
}
