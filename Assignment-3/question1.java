import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class question1
{
    public static void main(String [] args)
    {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(2, "qw");
        hashmap.put(10, "er");
        hashmap.put(35, "ty");
        hashmap.put(4, "ui");
        hashmap.put(6, "xy");
        System.out.println("For Loop:");
        for (Map.Entry me : hashmap.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        System.out.println("While Loop:");
        Iterator iterator = hashmap.entrySet().iterator();
        while (iterator.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator.next();
          System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        } 
    }
}