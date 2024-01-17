package SortingWithRecurssion;

public class CheckSortedRecurssion {


    public static void main(String[] args) {
        int no[] = {1, 2, 3, 4, 5};

        System.out.println(checkForSort(no, 0));
    }

    public static Boolean  checkForSort(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return (arr[index] < arr[index+1]) &&  checkForSort(arr, index+1);

    }

}
