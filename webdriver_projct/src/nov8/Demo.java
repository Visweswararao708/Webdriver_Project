package nov8;

import net.bytebuddy.asm.Advice.Return;

public class Demo {
public static void addtion(int x, int y) 
{
  int z= x+y;
  System.out.println(z);
}
public static String verifyingstring(String str1,String str2)
{
	String res = "";
	if (str1.equalsIgnoreCase(str2))
	{
	  res = "strings are equal";
	}
	else
	{

	}
	return res;
}
public static Boolean comparevalues(int a,int b)
{
	if (a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
Demo.addtion(62145, 87458);
Demo.verifyingstring("india", "india");
String result = Demo.verifyingstring("india", "india");
System.out.println(result);
Boolean x = Demo.comparevalues(100,100);
System.out.println(x);


	}

}
