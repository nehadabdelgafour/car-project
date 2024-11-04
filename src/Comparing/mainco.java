package Comparing;

public class mainco {
    public static void main(String[] args) {
        Comparing c1 =new Comparing(10,50);
       /* Comparing c2 =new Comparing(10,50);
        c1=c2;
      if (c1==c2)
          System.out.println("the oject are equal");
      else
          System.out.println("the oject are different");
          if  (c1.isequal(c2)) ;
        System.out.println("the oject are equal");
        else
        System.out.println("the oject are different");*/
        Comparing c2=new Comparing(c1);
        System.out.println(c2.getlangth());
        System.out.println(c2.getwagth());
    }

    }
