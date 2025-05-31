package hashmap;

import java.util.HashMap;

public class BasicHashmap {
	public static void main(String []args) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1,11);
		hm.put(2,12);
		hm.put(3,13);
		hm.put(4,14);
		
		System.out.println(hm.size());
		
		hm.put(1,100);   //for the same key value gets updated.
		
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(10));
		
		System.out.println(hm.get(1));
	}

}
