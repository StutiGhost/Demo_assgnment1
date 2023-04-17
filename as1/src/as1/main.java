package as1;

import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		//int s=0,avg=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int i, mul=1;
		for(i=1;i<=10;i++)
		{
			mul=n*i;
			System.out.println(n+"*"+i+"="+mul);
		}
	}

}

