import java.util.*;
public class Slot{
	public static void main(String[] args){
		System.out.print("幅(2-9)>>");
		int w = new Scanner(System.in).nextInt();
		boolean isWin=false;
		for(int i=0;i<3;i++){
			boolean isLine = true;
			int first=0;
			for(int j=0;j<w;j++){
				int n = new Random().nextInt(2)+1;
				if(j==0){
					first=n;
				}else{
					if(first != n){
						isLine=false;
					}
				}
				System.out.print(n);
			}
			if(isLine){
				isWin=true;
			}
			System.out.println();
		}
		System.out.println(isWin? "あたり":"はずれ");

	}
}
