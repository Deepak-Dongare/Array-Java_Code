package Array;

import java.util.Scanner;

public class ECW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Matri size");
		int size=sc.nextInt();
		int matrix[][]=new int[size][size];
		//int matrixsum[][]=new int[size][size];
		
		System.out.println("Enter Matrix element");
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				
				matrix[i][j]=sc.nextInt();
			}
		}
			System.out.println("<<<<<<<<<<<<<<<<<Matrix>>>>>>>>>>>>>>>>>>");

			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					
					System.out.print(" "+matrix[i][j]);
					
				}
				System.out.println();
				
			
	}
			//System.out.println();
			System.out.println("UPPER MATRIX");
		//	int sum;
			 for(int i=0; i<size; i++){
		            for(int j=0; j<size;j++){
		                if((i+j)<size)
		                	
		                	
		                    System.out.print(matrix[i][j] );
		                
	                 
		               
		            }
		       
			


			 }
			 
			 
			 
			 int sum=0;
			 for(int i=0; i<size; i++){
		            for(int j=0; j<size;j++){
		            	
		            	    sum=sum+matrix[i][j];
		            	
		            	
		            }
		          
		            System.out.println();
		            }
			 sum--;
			 System.out.print("::::: "+sum);
//		            
//			 for(int i=0; i<size; i++){
//		            for(int j=0; j<size;j++){ 
//			 matrixsum[i][j]=matrixsum[i][j]+matrix[i][j];
//           
//		            }
//		           
//			 
//			 }
			 
//			 for(int i=0; i<size; i++){
//		            for(int j=0; j<size;j++){ 
//		            	System.out.print(" "+matrixsum[i][j]);
//        
//		            }
//		            System.out.println();
//		           
//			 
//			 }
//			 

			 // for(int i=0)
	}}

