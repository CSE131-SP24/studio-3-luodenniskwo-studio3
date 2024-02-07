package studio3;

import java.util.Scanner;

public class Sieve {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Your n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		
		boolean[] primes = new boolean[n + 1];
		for(int i = 0 ;i < n + 1; i++)
		{
			primes[i]=true;
		}
		for( int j = 2; j < n; j++)
		{
			for(int k = 2 * j; k < n ; k = k + j )
			{
				primes[k] = false; 
			}
		}
		
		for(int v=2; v < n; v++)
		{
			if(primes[v])
			{
				System.out.print(v + " ");
			}
		}
		
		

	}

}
