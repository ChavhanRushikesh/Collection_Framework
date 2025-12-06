import java.util.*;

class Program4
{
    public static void main(String[] args) 
    {
        Vector <String> vobj = new Vector <String>();

        vobj.add("C");
        vobj.add("C++");
        vobj.add("Java");
        vobj.add("Python");
        vobj.add("C#");
        vobj.add("Java");                                       //Allow Duplicate data

        System.err.println("System.err.println_1 :" + vobj);

        vobj.add(2,"LSP");

        System.err.println("System.err.println_2:" + vobj);

        System.err.println("Capacity: " + vobj.capacity());                 //10
        System.err.println("Contains: " + vobj.contains("LSP"));
        System.err.println("Contains: " + vobj.contains("UNIX"));          //true of false

        vobj.remove(6);
        System.err.println("System.err.println_3:" + vobj);
      
    }
}
