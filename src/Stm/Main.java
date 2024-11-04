package Stm;

import Stm.Person;
import Stm.Student;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("mohamed", 24);

        Student st = new Student();

        st.name = "moooooooo";
        st.age = 18;

        st.move();
        st.exam("math");
        st.setLevel("mid");
    }
}
