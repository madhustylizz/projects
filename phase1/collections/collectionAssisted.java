package collections;
import java.util.*;


public class collectionAssisted {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> list=new ArrayList<String>();
		list.add("India");
		list.add("Australia");
		list.add("Paris");
		list.add("Tokyo");
		list.remove("Tokyo");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("\n");
		System.out.println(list);
		
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		
		System.out.println(v);
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("China");
		ll.add("Japan");
		ll.add("Rome");
		
		Iterator<String> it1=ll.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("\n");
		System.out.println(ll);
		
		System.out.println("\n");
		System.out.println("Hashset");
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1000);
		set.add(2000);
		set.add(3000);
		set.add(4000);
		System.out.println(set);
		
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(10);
		set2.add(11);
		set.add(13);
		set.add(14);
		System.out.println(set2);
	}

}
