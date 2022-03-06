package assignments020322;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
  public static void main(String[] args) {
        
	    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(1, new String("Apple"));
        linkedHashMap.put(2, new String("Orange"));
        linkedHashMap.put(3, new String("Banana"));
        linkedHashMap.put(4, new String("Guava"));
        linkedHashMap.put(5, new String("Mango"));
        linkedHashMap.put(6, new String("Grapes"));
        linkedHashMap.put(7, new String("Pineapple"));
        linkedHashMap.put(8, new String("Promaganate"));
        linkedHashMap.put(9, new String("custardapple"));
        linkedHashMap.put(10, new String("Dragonfruit"));
        
        System.out.println(linkedHashMap);
        for(Integer key : linkedHashMap.keySet())
        {
         System.out.println(key+""+linkedHashMap.get(key));
        }
        linkedHashMap.remove(4);
        linkedHashMap.remove(7);
		System.out.println(linkedHashMap);
		System.out.println(linkedHashMap.hashCode());
		System.out.println("checking:"+linkedHashMap.containsValue("banana"));
		System.out.println("checking:"+linkedHashMap.containsValue("apple"));

		linkedHashMap.clear();
		
		System.out.println(linkedHashMap);
		
}
        
}
