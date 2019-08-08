package Array;

import java.util.Scanner;

class binary{  
	int first;
	//int c;
		
		Scanner sc=new Scanner(System.in);
   
  // System.out.println("");
  
 /* binary(int a){
		
		//c=a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index size");
		int c =sc.nextInt();
		this.c=c;
		
	}*/
   
   
  int c =sc.nextInt();
  	
   int a[]=new int[c];
   int last=a.length-1;
   {
	   for(int i=0;i<c;i++) {
		   
		  System.out.println("Enter element");
		   a[i]=sc.nextInt();
		//  System.out.println(a.toString() );
	   }
	   for(int  i=0;i<c;i++) {
		   System.out.print(a[i]);
		   
	   }
	   
	   System.out.println("Enter key");
	   int key=sc.nextInt();
		   int mid=(last+first)/2;
		   /*System.out.println("Enter key");
		   int key=sc.nextInt();*/
		   
		   while(first<=last) {
			   
			   if(a[mid]<key) {first = mid + 1;   
			      }else if ( a[mid] == key ){
			          System.out.println("Element is found at index: " + mid+"::Element::"+key);
			          break;
			        }else{
			           last = mid - 1;
			        }
			        mid = (first + last)/2;
			     }
		   if ( first > last ){
			      System.out.println("Element is not found!");
			   }
				   
			   }
			   
		   }
	
public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub sc 
//	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter the index number" );
//	int d=sc.nextInt();
	
		
		   new binary();
	
	
	  
	}

}
