import java.util.*;
public class ForLes{
	public static void main(String[] args){
		System.out.print("小さい値>>");
		int min = new Scanner(System.in).nextInt();
		System.out.print("大きい値>>");
		int max = new Scanner(System.in).nextInt();
		int sum=0;
		for(int i=min;i<=max;i++){
			sum += i;
		}
		System.out.println(min + "から"+max+"までの和は"+sum+"です");
	}
}
