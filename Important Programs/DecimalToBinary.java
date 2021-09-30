package codes;
import java.util.Scanner; 
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number :");
		int decimal = sc.nextInt();
		int n=decimal;
//---------------CODE-------------------------------//
		int binary[]= new int[40];
		int index =0;
		while(decimal>0) {
			binary[index++]=decimal%2;
			decimal= decimal/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
//----------------CODE------------------------------//
		
//-------------------SHORTCUT---------------------//		
		String num = Integer.toBinaryString(n);
		System.out.println("Binary ="+num);
		
		sc.close();
	}

}
