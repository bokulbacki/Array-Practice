
public class arraychallenges2d
	{

		public static void main(String[] args)
			{
			 printNumber();
			 MHS ();
			 print9 ();
			}

		public static void printNumber() 
		{
			int numberArray [][]= { {10,20}, {30, 40}, {50, 60} };
			System.out.println(numberArray[2][1]);
		}
		public static void MHS ()
		{
			String[] [] matrix= new String [4][3];
			for (int i =0; i<4; i++)
				{
					for (int j = 0; j<3; j++)
						{
							System.out.print(matrix [i][j]= "MHS ");
							
						}
				System.out.println();
				}
			
		}
		public static void print9 ()
		{
			 int counter = 0;
		 int[][] nine = new int [3][3];
		 for (int row = 0; row<3; row++)
			 {
				
				 for (int column = 0; column<3; column++)
					 {
						 counter++;
						 System.out.print(nine [row][column]= counter);
						 
					 }
				 System.out.println();
			 }
		 int sum = nine [0][0] + nine [2][2] + nine [0][2] + nine [2][0];
		 System.out.println("The Four corners added up equals " + sum );
			 
				 
		}
	
	}