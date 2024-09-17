package coreJava01;

public class Java01 {

    /*
     * What is the class: Class is a blueprint of the template, 
     * class contains, methods,  blocks cons
     * What is object: all physical entries and instance of a class
     * Data types: 8 primitive data types
     * byte,short,int,long
     * Floating points numbers: float, double
     * characters: char
     * Boolean: boolean
     * 
     * Wrapper Types
     * Number: Byte, Short, Integer, Long
     * Floating: Float, Double
     * Characters: Charter
     * Boolean: Boolean
     *
     * Assignment Operators
     *
     */
    public static void main(String[] args) {
        System.out.println("Test");
        Java01 java = new Java01();
        //java.assignmentOperators();
        //java.relationalOperators();
        java.unaryOperators();


    }

    public  void unaryOperators(){

        int a = 10;
        int b = 20;

        a++;
        System.out.println(a);
        b--;
        System.out.println(b);
        ++b;
        System.out.println(b);
        --a;
        System.out.println(a);
    }

    public void relationalOperators(){
        /*
        < > <= >= == !=
         */
        int a = 10;
        int b = 5;
        int c = 10;
        System.out.println("<");
        System.out.println(a<b);
        System.out.println(a<c);
        System.out.println(b<c);

        System.out.println();
        System.out.println(">");
        System.out.println(a>b);
        System.out.println(a>c);
        System.out.println(b>c);

        System.out.println();
        System.out.println(">=");
        System.out.println(a>=b);
        System.out.println(a>=c);
        System.out.println(b>=c);

        System.out.println();
        System.out.println("<=");
        System.out.println(a<=b);
        System.out.println(a<=c);
        System.out.println(b<=c);

        System.out.println();
        System.out.println("==");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);

        System.out.println();
        System.out.println("!=");
        System.out.println(a!=b);
        System.out.println(a!=c);
        System.out.println(b!=c);
    }

    public void assignmentOperators(){
        int a =11;
        int b =12;

        System.out.println(a+=1);
        a+=1;
        System.out.println(a);
        System.out.println(a+=b);
        System.out.println(a);
    }
}
