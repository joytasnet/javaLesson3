import java.util.*;
public class Dice{
	public static void main(String[] args){
		int[] data=new int[10];
		for(int i=0;i<data.length;i++){
			int dice=new Random().nextInt(6)+1;
			data[i]=dice;
		}
		System.out.println(Arrays.toString(data));
	}
}
