import java.util.*;

class Program2 
{
    public static void main(String[] args) 
    {
        int arr[] = {45,21,90,54,78};

        for(int no : arr)
        {
            System.out.println(no);
        }

        int index = Arrays.binarySearch(arr, 90);
        System.out.println("Element found at: "+ index);
    }
}
