package Comparing;

public class Comparing {
    public boolean getwagth;
    private Object langth;
    private Object wagth;

    public Comparing(int l, int w) {
        int langth=l;
        int wagth=w;

    }

    public boolean isequal (Comparing obj2){
        if (this.langth==obj2.langth&&this.wagth==obj2.wagth)
            return true;
        else
            return false;


    }
    public Comparing(Comparing sourceobject){
        langth=sourceobject.langth;
        wagth=sourceobject.wagth;
    }

    public boolean getlangth() {
        return true;
    }

    public boolean getwagth() {
        return false;
    }
}

