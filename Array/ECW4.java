package Array;

import java.util.Scanner;

public class ECW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner  sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size =sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter Array Element");
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++){
			
				if (a[i] == a[j])
		               break;
		            if (i == j)
		               System.out.print( a[i] + " ");
			
			
		}
			}
	}
	
}
		
		
