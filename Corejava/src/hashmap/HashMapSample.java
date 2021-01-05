package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hm=new 	HashMap<Integer,String>();
		hm.put(1,"Paranthaman");
		hm.put(2,"Geetha");
		hm.put(4,"Akshara");
		System.out.println("Hasgmap displayed as list:"+hm);
		System.out.println("to display KeyValue of 4:"+hm.get(4));
		System.out.println("to display KeyValue of 3:"+hm.get(3));
		
		Set<Entry<Integer, String>> setMap=hm.entrySet();
		Iterator<Entry<Integer, String>> i=setMap.iterator();
		System.out.println("iterated value"+i.next());
		while(i.hasNext())
		{
			//Map.Entry<Integer, String> m=(Map.Entry)i.next();
			Map.Entry<Integer, String>m=(Map.Entry<Integer, String>)i.next();
			
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}

}
