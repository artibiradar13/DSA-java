import java.util.Scanner;

public class basics{
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
        //logical operators
        //and-&&, or-|| , not-!

    //conditional statements
        //if-else
        int x=3;
        if(x==3)
        System.out.println("number is 3");
        else
        System.out.println("no. is invalid");
        //switch
        int day=1;//1-monday ,2-tuesday
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                 System.out.println("Tuesday");
                break;
        
            default:
            System.out.println("wed-sun");
            break;
        }    
    
    //LOOPS
        //FOR
        //for(initialise; condition; update)
        for(int number=1;number<=10;number++) {
        System.out.println(number);
        }
        //WHILE
        //while(condition){block of codes}
        int i=10;
        while(i>=1){
            System.out.println(i);
            --i;
        }
        //DO WHILE
        //do{statements}while(condition);
        int j= 10;
        do{
            System.out.println(j);
            j--;
        }while(j>=1);

    //EXCEPTION HANDLING
        int[] marks1={14,24,56};


        try {
            System.out.println(marks1[5]);
        } catch (Exception e) {
            System.out.println("this is aman marks");
        }
        
    //FUNCTIONS/METHODS
         printsum(1,6);//calling function        

    }
        //function created
    public static void printsum(int a,int b){
        int sum=a+b; 
       System.out.println(sum); 
    }
}
        
       

        



            
        




        
        





