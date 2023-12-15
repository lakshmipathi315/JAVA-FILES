class Automaticnumber
{
	public static void main(String args[])
	{
		int num=99,square,rev=0,rev1=0,count=0;
		square=num*num;
		while(num>0)
		{
			count++;
			
			int rem=square%10;
			rev=rev*10+rem;
			square=square/10;
			if(count==2)
				break;
			
		
		}
		while(rev>0)
		{
			int rem1=rev%10;
			rev1=rev1*10+rem1;
			rev/=10;
			
		}
		System.out.println(rev1);			
		
		if(num==rev1)
			System.out.println("automatic number");
		else
			System.out.println("not automatic number");
	}

}