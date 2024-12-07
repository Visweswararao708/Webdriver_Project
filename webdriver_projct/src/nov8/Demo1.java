package nov8;

public class Demo1 {

	public static void main(String[] args) {
try {
	int x =9876,y=0,z;
	z=x/y;
	System.err.println(z);
}catch(Throwable t)
{
	System.out.println(t.getMessage());
	//t.printStackTrace();
}
   int a=87655,b=98,c;
   c=a/b;
   System.out.println(c);
	}

}
