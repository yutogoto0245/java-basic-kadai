package kadai_026;

import java.util.Scanner;

public class Jyanken_Chapter26 {
	public static String getMyChoice() {
		//初回固定のコメント
		System.out.println("自分のじゃんけんの手を入力する");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		
		
		//r s p　のどれかを入力するまで繰り返し処理
		while(true) {
			//Scannerクラスのオブジェクトをクローズする
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				
				//入力された出し手を返す
				return input;
			}
			System.out.println("正しい値を入力してください");
		}
	}
	
	
	//ランダムで出し手を選ぶ
	public static String getRandom() {
		String[] str = {"r", "s", "p"};
		int strNum = (int) (Math.floor(Math.random() * 3));
		//System.out.println(strNum);
		String strJyanken = str[strNum];
		System.out.println(strJyanken);
		return  strJyanken;
	}
	

}
