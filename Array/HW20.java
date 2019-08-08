package Array;

import java.util.Scanner;

public class HW20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Matrix size");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max1[][]=new int[a][b];
		int max2[][]=new int[a][b];
		int sub[][]=new int[a][b];
		
		
		System.out.println("Enter first matrix element");
		for(int i=0;i<a;i++) {
			
			for(int j=0;j<b;j++) {
				
				max1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter second  Matrix size");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		
		System.out.println("Enter first matrix element");
		for(int i=0;i<a1;i++) {
			
			for(int j=0;j<b1;j++) {
				
				max1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter Second  matrix  element");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				
				sub[i][j]=max2[i][j];
				
				System.out.println();
			}
		}
		
				System.out.println("Second matrix ");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				
				sub[i][j]=max2[i][j];
				System.out.println();
			}
		}
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				
				sub[i][j]=max1[i][j]-max2[i][j];
				
			}
			
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) 
				
						System.out.print(sub[i][j]+"\t");
			 		
			
			System.out.println();
				
				
			}
		
	}

}
