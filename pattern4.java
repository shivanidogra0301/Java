package Lecture2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int row=1;row<=N;row++) {
			
			for(int csp=1;csp<=N-row;csp++) {
				System.out.print(" ");
				
				
			}
			
		int	value=row;
		for(int cst=1;cst<=row;cst++) {
			System.out.print(value);
			
			value++;
		}value=value-2;
		
		for(int cst=1;cst<row;cst++) {
			System.out.print(value);
			value--;
			
			
		}
		
		
		
		
		System.out.println();
		
		}
		
	}

}
