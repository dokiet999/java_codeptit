package jv;
import java.util.Scanner;
public class J01003 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		float a = ip.nextFloat();
		float b = ip.nextFloat();
		if(a >= 0 && b > 0) {
			System.out.print("VN");
		}else if(b == 0){
			System.out.print("VSN");
		}else {
			System.out.print(String.format("%.2f",-b/a));
		}
	}
}
