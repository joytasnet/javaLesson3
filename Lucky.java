import java.util.*;
public class Lucky{
	public static void main(String[] args){
		int lucky=new Random().nextInt(11)+1;
		System.out.println("***当選者***");
		System.out.println("出席番号:"+lucky);
	}
}
