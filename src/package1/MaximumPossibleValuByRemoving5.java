package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumPossibleValuByRemoving5 {

	private  int findMaxDigit(int n) {
		String s2 = "";
		if(n>0)
		{
			String s = Integer.toString(n);
			for(int i=0;i<s.length();i++)
			{
				int n1 = Integer.parseInt(Character.toString(s.charAt(i)));
				System.out.println("n1 : "+n1);
				int n2 = 0;
				if(i<s.length()-1)
				n2 = Integer.parseInt(Character.toString(s.charAt(i+1)));
				System.out.println("n2 : "+n2);
				if(((n1==5)&&(n1<n2))||(!s.substring(i+1).contains("5")))
				{
					s2 = s.substring(0, i)+s.substring(i+1);
					break;
				}
				
			}
		}
		else {
			String s = Integer.toString(n).substring(1);
			for(int i=0;i<s.length();i++)
			{
				int n1 = Integer.parseInt(Character.toString(s.charAt(i)));
				System.out.println("n1 : "+n1);
				int n2 = 0;
				if(i<s.length()-1)
				n2 = Integer.parseInt(Character.toString(s.charAt(i+1)));
				System.out.println("n2 : "+n2);
				if(((n1==5)&&(n1>n2))||(!s.substring(i+1).contains("5")))
				{
					s2 = "-"+s.substring(0, i)+s.substring(i+1);
					break;
				}
				
			}
			
		}
		return Integer.parseInt(s2);
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findMaxDigit(15958), 1958);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findMaxDigit(-5859), -589);
	}

	@Test
	public void testCase3()
	{
		Assert.assertEquals(findMaxDigit(-5000), 0);
	}


}
