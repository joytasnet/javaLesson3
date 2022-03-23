import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 *サイコロ振ってそれが偶数か奇数かを判定する
		 (実行結果)
		 4は偶数です。
		 1は奇数です。
		 */
		int dice = new Random().nextInt(6)+1;

		/*
		if(dice == 2 || dice == 4 || dice == 6){
			System.out.println(dice + "は偶数です");
		}else{
			System.out.println(dice + "は奇数です");
		}
		*/
		//int mod = dice % 2;

		if(dice % 2 == 0){
			System.out.println(dice + "は偶数です");
		}else{
			System.out.println(dice + "は奇数です");
		}
	}
}
