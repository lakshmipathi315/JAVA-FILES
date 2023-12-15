class BankApplication
{
	public static void main(String args[])
	{
		String name_of_customer="lakshmipathi",service="Money_deposit";
		int Deposit=50000,withdraw=10000,balance=100000,Mobile_number=1234567890,PIN_number=2002,amount_withdraw=0;
		System.out.println("Name of the customer="+name_of_customer);
		System.out.println("amount to be deposit="+Deposit);
		System.out.println("amount to be withdraw="+withdraw);
		System.out.println("balance in the account="+balance);
		System.out.println("mobile number="+Mobile_number);
		System.out.println("pin number="+PIN_number);
		switch(service)
		{
			case "name_change":
				name_of_customer="Ram Charan";
				System.out.println("Updated customer name="+name_of_customer);
				break;
			case "mobile_change":
				Mobile_number=9876785;
				System.out.println("updated mobile number="+Mobile_number);
				break;
			case "pin_change":
				PIN_number=7447;
				System.out.println("updated pin number="+PIN_number);
				break;
			case "Money_deposit":
				Deposit=balance+Deposit;
				System.out.println("total amount in account="+Deposit);
				break;
			case "Money_withdraw":
				amount_withdraw=withdraw;
				System.out.println("total amount withdraw="+amount_withdraw);
				break;
			case "balance_enquiry":
				System.out.println("total amount in account="+balance);
				break;
			default:
				System.out.println("invalid service");
				
		}
	}
}