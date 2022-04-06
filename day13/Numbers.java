/*
3行3列の2次元配列を作成し、要素として
1-9の値をランダムに格納せよ。
実行例
[2,1,5]
[4,2,8]
[9,9,1]
*/
import java.util.*;
public class Numbers{
	public static void main(String[] args){
		int[][] data=new int[3][3];
		for(int i=0;i<data.length;i++){
			for(int j=0;j<data[i].length;j++){
				data[i][j]=new Random().nextInt(9)+1;
			}

		}

		for(int i=0;i<data.length;i++){
			System.out.println(Arrays.toString(data[i]));
		}


	}
}
