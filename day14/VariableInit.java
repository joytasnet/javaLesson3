import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		/* ng
		int n;
		System.out.println(n);
		*/
		/* ng
		 * Javaは条件式に入っている変数を調査しない
		int n;
		int x=5;
		if(x>0){
			n=10;
		}
		System.out.println(n);
		*/
		/* OK
		int n;
		if(5>0){
			n=10;
		}
		System.out.println(n);
		*/
		
		/* ok
		 * if ~else文はどちらか一方をとおることが保証されている文なので
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n=20;
		}
		System.out.println(n);
		*/
		/* ng
		int n;
		int x=5;
		if(x > 0){
			n=10;
		}else if(x <=0){
			n=20;
		}
		System.out.println(n);
		*/
		/*OK
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
		/*ng
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			//n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/
		/* ng
		int n=new Random().nextInt(3);
		String fortune;
		switch(n){
			case 0:
				fortune="大吉";
				break;
			case 1:
				fortune="吉";
				break;
			case 2:
				fortune="凶";
				break;
		}
		System.out.println(fortune);
		*/
		/* ok
		int n=new Random().nextInt(3);
		String fortune;
		switch(n){
			case 0:
				fortune="大吉";
				break;
			case 1:
				fortune="吉";
				break;
			default:
				fortune="凶";
		}
		System.out.println(fortune);
		*/
		/* ok
		int n;
		if(true){
			n=10;
		}
		System.out.println(n);
		*/
		/* ng
		int n;
		boolean isOk=true;
		if(isOk){
			n=10;
		}
		System.out.println(n);
		*/
		/* ok
		 * do ~ whileは最低1回はとおることが保証されている文
		int n;
		do{
			n=10;
		}while(false);
		System.out.println(n);
		*/
		/* ok
		int n;
		for(;;){
			n=3;
			break;
		}
		System.out.println(n);
		*/
		/*ng
		 * 継続条件に変数が入っている
		int n;
		for(int i=0;i<10;i++){
			n=3;
		}
		System.out.println(n);
		*/

	}
}
