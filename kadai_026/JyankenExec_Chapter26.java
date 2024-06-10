package kadai_026;

import java.util.HashMap;

public class JyankenExec_Chapter26 extends Jyanken_Chapter26 {
	public static void main(String[] args) {
	Jyanken_Chapter26 Jyanken = new Jyanken_Chapter26(); 
	
	
	//HashMap作成
	HashMap<String,String> handMap = new HashMap<String,String>();
	handMap.put("r", "グー");
	handMap.put("s", "チョキ");
	handMap.put("p", "パー");

	//自分の出し手
	String myHand = handMap.get(Jyanken.getMyChoice());
	//ランダム（相手）の出し手
	String randomHand = handMap.get(Jyanken.getRandom());
	//お互いの出し手コメント
	String choice = "自分の手は" + myHand + "," + "対戦相手の手は" + randomHand;
	System.out.println(choice);
	
	//playGameに　自分の出し手、ランダム出し手を渡す
	playGame(myHand, randomHand);
	

	}
	
	
	//結果出力
	public static void playGame(String me, String opponent) {
		if (me.equals(opponent) ) {
			System.out.print("あいこです");
		} else if (me.equals("パー") && opponent.equals("グー")) {
			System.out.println("自分の勝ちです");
		} else if (me.equals("チョキ") && opponent.equals("パー")) {
			System.out.println("自分の勝ちです");
		} else if (me.equals("グー") && opponent.equals("チョキ")) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	
	}
	
	
	
	
}
