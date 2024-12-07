package nov7;

public class Sample1 {
int x,y,z;//global non static variables
public void add()
{
  x=200;
  y=235;
  z=x+y;
  System.out.println(z);
}
public void division()
{
	x=3256;
	y=15;
	z=x/y;
	System.out.println(z);
			
}
	public static void main(String[] args) {
// calling non static method with class reference object
		sample x = new sample();
		x.add();
		x.division();
	}

}
