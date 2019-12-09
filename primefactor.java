package assignments;

import java.util.Scanner;

public class primefactor {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int flag=0;
			int temp=num/i;
			for(int j=2;j<=temp;j++) {
				if(temp%j==0) {
					flag=1;
				}
			}
			if(flag==0&& num%temp==0) {
				System.out.println(temp);
				break;
			}
		}
	}
}
