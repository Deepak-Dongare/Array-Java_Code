package Array;

import java.util.Scanner;

class Demo {
	int size;
	int a;
	int c[] = new int[5];

	/*
	 * Demo(Class<Array.a[]> class1){
	 * 
	 * // this.a[]=a[];
	 * 
	 * }
	 */
	/*
	 * Demo(int a){ this.a=a; }
	 */
	Demo(int a[],int size) {

			this.size=size;
		c = a;
		disp();
	}

	void disp() {
		for (int i = 0; i <size; i++) {
			System.out.print(":::"+c[i]);
		}

	}

	/*
	 * void accept(Scanner s, int x) { // int n = 0; int n = a;
	 * 
	 * System.out.println("Enter Array element");
	 * 
	 * // int[] r = null; for (int i = 0; i < x; i++) { c[i] = s.nextInt(); //
	 * System.out.println(c[i]);
	 * 
	 * } for (int i = 0; i < x; i++) { System.out.println(c[i]); }
	 * 
	 * }
	 */
}

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Scanner s=sc;
		System.out.println("Enter Array size");
		int l = sc.nextInt();
		int a[] = new int[l];
		System.out.println("Enter element");
		for (int i = 0; i < l; i++) {
			a[i] = sc.nextInt();

		}
	// new Demo(a);
		// Demo d=new Demo(l);
		 Demo d=new Demo(a,l);
		// d.accept(sc,l);
		 //	d.disp();

	}

}
