import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr={1,3,5,2,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                    swapped=true;
                }
            }
            
        if(!swapped){
            break;}
            
        }
    }
}
