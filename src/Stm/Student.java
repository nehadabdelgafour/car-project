package Stm;

public class Student extends Person {

    private String level;
    private String address;

    protected String id ;

    public void exam(String examName){
        System.out.println(super.name + " is busy he is in exam : " + examName);
    }

    public void setLevel(String level){
        this.level = level;
    }

    public String getLevel(){
        return this.level;
    }
}
