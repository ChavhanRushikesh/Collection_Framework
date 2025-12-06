import java.util.*;

class Program8
{
    public static void main(String[] args) 
    {
        Hashtable<String, Integer> hobj= new Hashtable<String, Integer>();

        hobj.put("PPA",27000);
        hobj.put("LB",28000);
        hobj.put("LSP",29000);
        hobj.put("Python",30000);

        System.out.println(hobj);
        System.out.println(hobj.get("LB"));
        
    }
}