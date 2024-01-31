import java.util.Scanner;

public class basics1{
    public static void main(String[] args) {
    //output code
        System.out.println("Hello World");
    //input code
        Scanner input= new Scanner(System.in); //input is a variable    
        System.out.println("Input Your marks ");
        int marks= input.nextInt();
        System.out.println(marks);


    //variables-to store temporary data in memory
         String name="Aman";
        int age= 30;

    //data types 
        /*primitive data type
         * byte
         * short
         * int
         * long
         * float
         * double
        */
        byte age1=30;
        int phone= 123456566;
        long telephone=23456775L;
        float pi=3.14F;

        /*non-primitive -strings,arrays */
        String Name="Leo";
        System.out.println(Name.length());
        //concatenate
        String name1="Vara";
        String name2="Sar";
        String fullname=name1+" "+name2; 
        System.out.println(fullname);
        System.out.println(name1.charAt(0));
        String change= name1.replace('a', 'b');
        System.out.println(change);

    //operators
        //Arithmetic operator(+,-,*,/,%)
            int a=4;
            int b=6;
            int add=a+b;
            System.out.println(add);
        //unary operator(++,--)
            int numb=1;
            System.out.println(numb++);  //increament after declaration  
            System.out.println(++numb);  //first increment then declaration
            System.out.println(numb--);
            System.out.println(--numb);
        //comparison operators
        /*
         * a==b
         * a!=b
         * a<b,a>b
         * a<=b,a>=b
         */
        //;logical operators
        //and-&&, or-|| , not-!
            
        




        
        



    }
}
