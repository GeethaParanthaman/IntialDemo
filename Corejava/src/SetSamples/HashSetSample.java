package SetSamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
	
	/*3 Types of set interface
	 * Hashset, Treeset,Linked Hashset
	 *  it will display the list with suppress of duplicate value
	 *  It will not maintain the sequential order
	 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 HashSet<String> hs=new HashSet<String>();
		
	
		hs.add("Geetha");
		hs.add("Paranthaman");
		System.out.println("added list display:"+hs);
		hs.add("Paranthaman");
		System.out.println("List display after adding duplicate value:"+hs);
		System.out.println(hs.isEmpty());
		System.out.println("size of the list"+hs.size());
		System.out.println("is list conatains"+hs.contains("hghjhj"));
hs.add("Akshitha");
hs.add("Akshara");
hs.add("yazhu");
hs.add("nila");
hs.add("Nilani");
//System.out.println("After addition of list"+hs);
Iterator<String> i=hs.iterator();
//System.out.println(iteratr.next());
//System.out.println(iteratr.next());
while(i.hasNext())
{
	
	System.out.println(i.next());
}





	}

}
