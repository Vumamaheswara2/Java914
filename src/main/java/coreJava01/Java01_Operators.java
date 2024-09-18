package coreJava01;

import com.oracle.deploy.update.UpdateCheck;

public class Java01_Operators {

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
        Java01_Operators java = new Java01_Operators();
        /**
        java.assignmentOperators();
        java.relationalOperators();
        java.unaryOperators();
         **/
        java.logicalOperators();


    }

    public void logicalOperators(){
        /*
        Logical &&, || , !
         */
        System.out.println("Logical operator AND - &&");

        System.out.println(true && false);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Logical operator OR - ||");

        System.out.println(true && false);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Logical operator NOT - !");

        System.out.println(!true);
        System.out.println(!false);

    }

    public  void unaryOperators(){
        //unary operators
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

        System.out.println("2nd method");
        int i = 10;
        int j = 20;

        System.out.println(i++);
        System.out.println(--j);
        System.out.println(i--);
        System.out.println(j++);

        System.out.println(i);
        System.out.println(j);
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
