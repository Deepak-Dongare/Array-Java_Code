package Array;

import java.util.Scanner;

public class HW9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int Array[] = new int[n];

		System.out.println("Enter element");

		for (int i = 0; i < n; i++) {

			Array[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int count = 1;
			if (Array[i] > 0) {

				count++;
				//Array[i]=0;
			
				  
				  
				  for(int j=0;j<n;j++) {
				 
				 
				 }
				 
			System.out.println("Postive number:" + Array[i] + "::" + count);
				
				//Array[i]=0;
			}

		}

		for (int i = 0; i < n; i++) {
			int count = 1;
			if (Array[i] < 0) {

				count ++;
				System.out.println("negative number:" + Array[i] + "::" + count);

			}

		}

	}

}
