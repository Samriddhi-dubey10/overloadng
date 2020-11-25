package exp17;

public class sum {
	public int Sum(int a, int b)
	{
		return(a+b);
	}
	public int Sum(int a,int b, int c ) {
		return(a+b+c);
	}
	public double Sum(double a, double b)
	{
		return (a+b);
	}
	public static void main(String args[]) {
		
		sum s =new sum();
		System.out.println(s.Sum(10, 30));
		System.out.println(s.Sum(10, 30,50));
		System.out.println(s.Sum(10.30, 30.30));
		
		
	}

}
