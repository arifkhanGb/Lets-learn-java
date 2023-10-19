package FirstPackage;

class NumHalfPyramid{
		static int n =5;
	
	public void NumericalHalf() {
		
		for(int row = 1; row<= n; row++)
		{
			for(int col = 1; col < row; col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public void InvertedNumericalHalf() {
		
		for(int row = 0; row<n; row++)
		{
			for(int col = 1; col < (n-row); col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
public void fullPyramid() {
		
		for(int row = 1; row<=n; row++)
		{
			for(int col = 1; col <= (n-row); col++)
			{
				System.out.print(" ");
			}
			for(int col = 1; col <(row+1); col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
public void InvertfullPyramid() {
	
	for(int row = 0; row<n; row++)
	{
		for(int col = 0; col <row; col++)
		{
			System.out.print(" ");
		}
		for(int col = 0; col <(n-row-1); col++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

public class NumericalHalfPyramid {

	public static void main(String[] args) {
		
		NumHalfPyramid obj = new NumHalfPyramid();
//		obj.NumericalHalf();
//		obj.InvertedNumericalHalf();
//		obj.fullPyramid();
		obj.InvertfullPyramid();
		

	}

}
