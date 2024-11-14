class StringReverse
{
	public static void main(String[]args)
	{
		int number = 56789;
		int reverse = 0;
		
		System.out.println("The initial string " + number);
		
		while(number != 0)
		{
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		System.out.println("Reverse number " + reverse);
	}
}