import java.util.*;

class Program3
{
    public static void main(String[] args) 
    {
        Vector <Integer> vobj = new Vector <Integer>();

        vobj.add(11);
        vobj.add(21);
        vobj.add(51);
        vobj.add(101);
        vobj.add(111);

        System.err.println("System.err.println_1 :" + vobj);

        vobj.add(2,10);

        System.err.println("System.err.println_2:" + vobj);

        System.err.println("Capacity: " + vobj.capacity());                 //10
        System.err.println("Contains: " + vobj.contains(101));
        System.err.println("Contains: " + vobj.contains(102));          //true of false
      
    }
}
