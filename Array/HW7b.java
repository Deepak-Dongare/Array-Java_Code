package Array;

import java.util.Scanner;

public class HW7b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int a=sc.nextInt();
		int b[]= new int[a];
		System.out.println("Enter Element");
		for(int i=0;i<a;i++) {
			
			b[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a;i++) {
			for(int j=1;j<a;j++) {
				if(b[j-1]>b[j]) {
					
					int temp;
					
					temp=b[j-1];
					b[j-1]=b[j];
					b[j]=temp;
					
					
				}
			//	j=j+1;
			}
			
		}
		for(int i=0;i<a;i++) {
			
			System.out.println(b[i]);
		}

	}

}
