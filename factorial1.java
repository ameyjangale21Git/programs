class factorial1
{
	public static void main(String[]args)
	{
		int num = 10;
		int i = 1;
		while(i<=num)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		i++;
		}
	}
}