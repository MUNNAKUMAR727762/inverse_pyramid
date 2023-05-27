package star;
import java.util.*;
public class inverted_piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      piramid(n);
	}
	public static void piramid(int n) {
		for(int i=1; i<=n; i++) {
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
