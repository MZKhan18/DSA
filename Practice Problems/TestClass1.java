package testClass;
import java.util.Scanner;
public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int N = sc.nextInt();
		print(N,1);
		sc.close();
		
	}
	
		static int print(int x, int y) {
		if(y<=x) {
			System.out.print(y+" ");
			return print(x,y+1);
		}
		return 1;
	}

}
