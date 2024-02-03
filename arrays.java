import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    // ARRAYS- collection of similar datatype 
    public static void main(String[] args) {
    //syntax
    // int[] marks=  new int[5];
        int arr1[]=new int[]{1,2,3,4,5};
        String[] arr2= new String[]{"aa","bb","cc"};
        System.out.println(arr2[0] + arr1[0]);

    //usert input
        Scanner in= new Scanner(System.in);
        int marks[]=new int[5];

        for (int i=0;i<marks.length; i++)//input code
            marks[i]=in.nextInt();
        for (int i=0;i<marks.length; i++)//output code
            System.out.print(marks[i]+" ");
        System.out.println(Arrays.toString(marks));//[76,45,34,78,88]
        
    //multidimentional arrays
    /*int[][] array= new int[rows][columns]; SYNTAX
         3 4 5
         1 2 5
         8 9 0
     */        
        // int[][] arr2d= new int[][]{{1,2,3},{3,4,5}};
        // int[][] arr2D={
        //      {1,2,3},
        //      {4,5,6}
        //              };

    //input
        int[][] mat=new int[2][2];
        for(int row=0;row<mat.length;row++){//input array code
            for(int col=0; col<mat[row].length;col++ )
            mat[row][col]=in.nextInt(); }
        //output code            
        for(int row=0;row<mat.length;row++){
            for(int col=0; col<mat[row].length;col++ )
            System.out.println(mat[row][col]);} 
        System.out.println();  
    //output =[1,2][3,4]
        for(int row=0;row<mat.length; row++)
        System.out.println(Arrays.toString(mat[row]));     
        in.close();  
        
   //Dynamic array-column not fixed of size
        int[][] arrD={
            {1,2,3},
            {3,4,},
            {5,6,7}
        };
         for(int row=0;row<arrD.length;row++)      
            for(int col=0; col<arrD[row].length;col++)
            System.out.println(arrD[row][col]);

    //ARRAY LIST-  it is class which is resizable        
    //syntax
        ArrayList<Integer> list= new ArrayList<>(10);
        list.add(78);//elements of list
        System.out.println(list);
        //input
        for(int i =0;i<5;i++){
            list.add(in.nextInt());
        }
        //to get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }

    //multi-ARRAYList
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        
        //intialisation
        for(int y=0;y<3;y++){
            list2.add(new ArrayList<>());}
        //add elements
        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                list2.get(i).add(in.nextInt());
            }
         }
         System.out.println(list2);

    }
    
}
