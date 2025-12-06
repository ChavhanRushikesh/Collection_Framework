import java.util.*;

class demo
{
    int arr[]={45,21,90,54,78};

    void display()
    {
        for(int no : arr)
        {
            System.out.println(no);
        }

        Arrays.sort(arr);
        System.out.println("Array after sorting...");

        for(int no : arr)
        {
            System.out.println(no);
        }
    }
}
class Program1
{
    public static void main(String [] agrs)
    {
        demo obj=new demo();
        obj.display();
    }
}