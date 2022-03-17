import static java.lang.System.*;
public class Rpg{
	public static void main(String[] args){
		String name="ロト";
		int hp=100;
		out.println("スライムが出てきた！");
		out.println("スライムの先制攻撃");
		out.println(name + "は30のダメージを受けた");
		hp = hp - 30;
		out.println(name+"(" + hp +")");
		out.println("スライムの連続攻撃");
		out.println(name + "は100のダメージを受けた");
		hp = hp - 100;
		out.println(name+"(" + hp +")");
		out.println(name+"は力尽きた");
		out.println("GameOver");

	}
}
