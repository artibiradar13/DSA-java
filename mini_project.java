import java.util.Scanner;

public class mini_project {
   public static void main(String[] args) {
      
      int mynumber = (int)(Math.random()*100);
      int usernumber=0;
      Scanner input=new Scanner(System.in);

       do{
            System.out.println("Guess the Number(1-100):");
            usernumber=input.nextInt();
            
            if(usernumber==mynumber){
               System.out.println("CORRECT NUMBER");
               break;}
            else if(usernumber>mynumber)   
               System.out.println("Number is large");
            else
               System.out.println("Number is small ");

      }while(usernumber>=0);

      System.out.println("correct no. is ");
      System.out.println(mynumber);
      input.close();

        
    }
}