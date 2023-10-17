package FirstPackage;

public class calcSum {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		while(i<=10)
		{
			if(i%2==0) {
				sum = sum+i;
				System.out.print(" " +i + " ");
			}
			
			i++;
		}
		System.out.println();
		System.out.println("sum of above even numbers = " + sum);

	}

}
