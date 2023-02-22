package javaouterclass;

public class main {
    public static void main(String[] args) {
      outerclass myouter=new outerclass() ;
      outerclass.innerclass myinner=myouter .new innerclass();

        System.out.println(myinner .y+myouter .x);

    }

}
