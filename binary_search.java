public class binary_search {
    public static void main(String[] args) {
        int[] arr={3,4,5,8,65,43,36,19};
        int target=56;
        int ans= binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target){
        if(arr.length==0){
        return -1;

    }
    int start=0;
    int end= arr.length-1;
    while(start<=end){
        int mid=start +(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;

        }
        else if(target>arr[mid]){
            start=mid+1;

        }
        else
        return mid;
    }
   return -1;
    }


}
