package Array;
import java.util.Scanner;
class ArraysToMethod {
	
	public int max(int array[])
	{
		int max=0;
		for(int i=0;i<=array.length;i++) {
			
			if(array[i]>max) {
				max=array[i];
			}
		}

		return max;
		
		
	}
	 public int min(int  array[]) {
	      int min = array[0];
	   
	      for(int i = 0; i<array.length; i++ ) {
	         if(array[i]<min) {
	            min = array[i];
	         }
	      }
	      return min;
	   }

}

public class CW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		int MyArray[]= new int[size];
		System.out.println("Enter the element ");
		for(int i=0;i<size;i++) {
			
			 MyArray[i]=sc.nextInt();
			
		}
		
		ArraysToMethod m=new ArraysToMethod();
		System.out.println("Max value"+m.max(MyArray));
		System.out.println("Min value"+m.min(MyArray));
		
		

	}

}
