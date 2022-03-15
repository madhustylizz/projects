package mapdemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class mapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashm=new HashMap<Integer,String>();
		hashm.put(1,"Madhu");
		hashm.put(2,"Hari");
		hashm.put(3,"Chandu");
		System.out.println("\n The elements of Hashmap are");
		for(Map.Entry m:hashm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//HashTable
		
		Hashtable<Integer,String> hasht=new Hashtable<Integer,String>();
		hasht.put(4, "Bharath");
		hasht.put(5, "Kittu");
		hasht.put(6,"Rakesh");
		hasht.put(7, "Pawan");
		hasht.put(8, "Mohan");
		System.out.println("\nThe Elements of Hashtable are");
		for(Map.Entry n:hasht.entrySet()) {
			System.out.println(n.getKey()+" "+n.getValue());
		}
		//TreeMap
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(9, "Kiran");
		map.put(10, "Sana");
		map.put(11, "Charan");
		System.out.println("\nThe Elements of TreeMap are");
		for (Map.Entry o :map.entrySet()) {
			System.out.println(o.getKey()+" "+o.getValue());
		}
		
		

	}

}
