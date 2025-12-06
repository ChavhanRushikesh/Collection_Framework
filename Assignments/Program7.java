import java.util.*;

class Program7
{
    public static void main(String[] args) 
    {
        LinkedList <Double> vobj = new LinkedList <Double>();

        vobj.add(10.5);
        vobj.add(30.7);
        vobj.add(12.6);
        vobj.add(34.2);
        vobj.add(34.3);

        System.err.println("System.err.println_1 :" + vobj);

        vobj.addFirst(10.0);
        vobj.addLast(100.0);
        vobj.remove(2);
        System.err.println("System.err.println_2:" + vobj);

        Iterator iobj=vobj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
    }
}
