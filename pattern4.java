package Lecture2;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(row<=N) {
			int csp=1;
			while(csp<=N-row) {
				System.out.print(" ");
				csp++;
				
			}
			int cst=1;
		int	value=row;
		while(cst<=row) {
			System.out.print(value);
			cst++;
			value++;
		}value=value-2;
		cst=1;
		while(cst<row) {
			System.out.print(value);
			value--;
			cst++;
			
		}
		
		
		
		
		System.out.println();
		row++;
		}
		
	}

}
