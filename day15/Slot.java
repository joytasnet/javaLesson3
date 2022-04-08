import java.util.*;
public class Slot{
	public static void main(String[] args){
		final int SIZE=3;
		Random rand=new Random();
		int[][] board=new int[SIZE][SIZE];
		int lines=0;
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[i].length;j++){
				board[i][j]=rand.nextInt(3)+1;
				System.out.print(board[i][j]);
			}
			System.out.println();
			if(isSame(board[i])){
				lines++;
			}
		}
		System.out.printf("%s%n",lines>0?lines+" lines Win!!":"Lose...");
	}
	public static boolean isSame(int[] arr){
		int first=arr[0];
		for(int i=1;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
}
