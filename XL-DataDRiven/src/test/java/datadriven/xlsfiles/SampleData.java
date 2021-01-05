package datadriven.xlsfiles;

import java.io.IOException;
import java.util.ArrayList;

public class SampleData {
	
	public static void main(String[] args) throws IOException
	{
		DatDrivenDemo obj=new DatDrivenDemo();
		 
		ArrayList<String> newList= obj.getDataXls("Profile Add");
		System.out.println("Size ofthe array"+newList.size());
		System.out.println(newList.get(0));
		System.out.println(newList.get(1));
		System.out.println(newList.get(2));
		System.out.println(newList.get(3));
		
		
		
	}
	

}
	