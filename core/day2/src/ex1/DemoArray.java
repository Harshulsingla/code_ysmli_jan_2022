package ex1;

//Array, methods returing arrays etc
public class DemoArray {

	public static void main(String[] args) {

		// adding 2 matrix, mutiplication
		int a[][] = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };
		int b[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		int c[][] = addTwoMatrix(a, b);

		boolean status = isIdentityMatrix(a);

		System.out.println(status);
//		
//		int a[]= {4,6,7,8};
//		
//		int b[]= {1,6,7,8};

		// 6 6 7 8 1 6 7 8

//		int c[]=addToArrays(a, b);
//		
//		for(int temp: c) {
//			System.out.print(temp+" ");
//		}

		// int b[]=addTwoToEachElementsOfArray(a);

		// int sumOfElements=sumOfArrays(a);
		// System.out.println(sumOfElements);

	}

	private static boolean isIdentityMatrix(int[][] a) {
		boolean isIdentiy = true;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
					if(i==j) {
						if(a[i][j]!=1) {
							isIdentiy=false;
						}
					}else {
						if(a[i][j]!=0) {
							isIdentiy=false;
						}
					}
			}
		}
		return isIdentiy;
	}

	private static int[][] addTwoMatrix(int[][] a, int[][] b) {
		int c[][] = new int[3][3];
		// logic

		return c;
	}

	public static int[] addToArrays(int a[], int b[]) {
		int c[] = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int j = 0; j < b.length; j++) {
			c[j + a.length] = b[j];
		}

		return c;
	}

//	public static int[] addTwoToEachElementsOfArray(int a[]) {
//		int b[]=new int[a.length];
//		for(int i=0;i<a.length; i++) {
//			b[i]=a[i]+2;
//		}
//		return b;
//	}

//	public static int sumOfArrays(int a[]) {
//		int sum=0;
//		for(int temp: a) {
//			sum+=temp;
//		}
//		return sum;
//	}
}
