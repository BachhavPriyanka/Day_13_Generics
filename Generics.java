package day13_Generics;


public class Generics {

	static int findMaximum(int arr[], int low, int high)
    {
       int max = arr[low];
       int i;
       for (i = low; i <= high; i++)
       {
           if (arr[i] > max)
              max = arr[i];
       }
       return max;
    }
     
    public static void main (String[] args)
    {
        int arr[] = {70, 30, 40, 50, 60, 1, 23, 20};
        int n = arr.length;
        System.out.println("The maximum element at 1st position is : "+
                            findMaximum(arr, 0, n-1));
        for(int element: arr)
        System.out.print("Array " + element + " ");
        
    }
}