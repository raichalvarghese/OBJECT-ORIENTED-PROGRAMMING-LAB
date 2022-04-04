import java.util.*;
public class transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix:");
		int n=sc.nextInt();
		System.out.println("Enter the elements of the matrix:");
		int[][] a=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int[][] t=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				t[i][j]=a[j][i];
			}
		}
		System.out.println("Entered matrix:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Transpose:\n");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
