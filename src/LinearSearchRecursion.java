public class LinearSearchRecursion {

        static int  index = 0;
    public static void main(String[] args) {
        int[] arr = {3,45,67,54,56,23,9,49,55,31,77};
        int target = 9;
        System.out.println( linearSearch(arr,target));
    }

    static int linearSearch(int[] arr, int target){
        if(index >= arr.length){
            return -1;
        }
         if( arr[index] != target){
             index++;
             return linearSearch(arr,target);
         } else return index;
    }
}
