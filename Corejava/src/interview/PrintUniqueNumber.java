package interview;

import java.util.ArrayList;


public class PrintUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 4,5,5,5,4,6,6,9,4,6
 * 4-3times, 5-3times 6-3times 9-1time
 */
		int a[]= {4,5,5,5,4,6,6,9,4,6};
		ArrayList<Integer> uni=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!uni.contains(a[i]))
			{
				uni.add(a[i]);
				k++;
				
			
			for(int j=i+1;j<a.length;j++)
				
			{
				if(a[i]==a[j])
				{
					k++;
				}
				
			}
			System.out.println(a[i]);
			System.out.println(k);
			}
			
			if(k==1)
			{
				System.out.println("uniquie value"+a[i]);
			}
		
		}
			
	}

}
