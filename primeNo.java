package FirstPackage;

import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		
		int c;
		
		    for(int i=2 ; i< 10;i++)
		    {
		    	c= 0;
		    	for(int j =2; j<i; j++)
		    	{
		    		if(i%j==0)
		    		{
		    			c++;
		    			break;
		    		}
		    	}
		    	if(c==0)
		    		System.out.print(i);
		    }

	}

}
