class q8

{
	public static void main(String args[])
	{
		for(int i = 1; i<=4; i++)
		{
			for (int j = 1; j<=4; j++ )  // for J
			{
				if(i == 1 && j == 4 || i ==  2 && j ==  4 || i ==  3 && j ==  1 || i ==  3 && j ==  4||i ==  4 && j ==  2 || i ==  4 && j ==  3 )
				{
				System.out.print("J");
				}
				
				else{
				System.out.print(" ");
				}
				
				
			}
}}}