class Powernumber
{
	public static void main(String args[])
	{
		int num=315,sum=0,product=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			product=rem*product;
			num/=10;
		}
		System.out.println(sum);
		System.out.println(product);
		if(sum==product)
			System.out.println("Power number");
		else
			System.out.println("not power number");
	}
}
