package Lecture4;

import java.util.Scanner;

public class RainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int T =s.nextInt();
		int w=0;
		for(;T>0;T--) {
			int N=s.nextInt();
			int[] arr;
			arr=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
				}
			int[] left=new int[N];
			int[] right=new int[N];
			left[0]=arr[0];
			for(int i=1;i<N;i++) {
				left[i]=java.lang.Math.max(left[i-1],arr[i]);
				
			}right[N-1]=arr[N-1];
			for(int i=N-2;i>=0;i--) {
				right[i]=java.lang.Math.max(arr[i], right[i+1]);
			}w=0;
			for(int i=0;i<N;i++) {
				w=w+java.lang.Math.min(right[i], left[i])-arr[i];
			}
			System.out.println(w);
		

	}

}}
