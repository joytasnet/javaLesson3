import java.util.*;
public class ForLesson{
	public static void main(String[] args){
		System.out.println("Start");
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		System.out.println("End");
		int sum=0;
		for(int i=10;i<=1000;i++){
			sum +=i; //sum = sum + i;
		}
		System.out.println(sum);
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
		for(int i=0;i<10 ;i++){
			System.out.println(i);
		}
	}
}
