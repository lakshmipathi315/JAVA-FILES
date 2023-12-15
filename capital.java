class Capital
{
	public static void main(String args[])
	{
		char letter='A';
		if(letter>='A' && letter<='Z')
			{
				System.out.println("Capital letter"); // check wheather a given character a capital vowel or consonent or small vowel or consonent
			}
		else if(letter>='a' && letter<='z')
			{
				System.out.println("Small letter");
			}
		else if(letter>='0'&& letter<='9')
			{
				System.out.println("Number");
			}
		else if(letter==' ')
			{
				System.out.println("Space");
			}
		else if(letter=='@' || letter=='&' || letter=='#' || letter=='$')
			{
				System.out.println("Symbol");
			}
		else if(letter=='a' || letter=='e' ||letter=='i' || letter=='o' || letter=='u')
			{
				System.out.println("small vowel");
			}
		else
			{
				System.out.println("invalid");
			}
		
	}
}