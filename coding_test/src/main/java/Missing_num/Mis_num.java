package Missing_num;

import java.util.Scanner;

public class Mis_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int ar_to=0;
		int n=sc.nextInt();
		int tot=(n*n+1)/2;
		int a[]=new int[n];
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Total="+tot);
		for(int i=0;i<=a.length;i++) {
			ar_to= ar_to + a[i];
		}
		System.out.println(ar_to);
	System.out.println("Missing Number is"+(tot-ar_to));
	}

}
