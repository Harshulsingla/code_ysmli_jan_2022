package day1;

import java.util.Scanner;

public class Pascal {
	
	public static void main(String[] args) {
		
		int a[][]=new int[5][5];
		int i,j;
		int n=5;
		 for(i=0;i<n;i++){
	            for(j=0;j<=i;j++)
	                if(j==0 || j==i)
	                    a[i][j]=1;
	                else
	                    a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		 
		 System.out.println("printing pascal Triangle....");
		 
		 for(int temp[]: a) {
			 for(int temp2: temp) {
				 System.out.print(temp2+" ");
			 }
			 System.out.println();
		 }

//		System.out.println("PE a value ...");
//		Scanner  scanner=new Scanner(System.in);
//		int value=scanner.nextInt();
//		System.out.println(value);
	}

}
