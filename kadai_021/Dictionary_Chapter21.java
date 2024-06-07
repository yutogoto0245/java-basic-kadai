package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public static void getFruit(String[] arr) {
		//英単語の辞書として機能するHashMapを宣言
		HashMap<String, String> fruitMap = new HashMap<String, String>();

		
		fruitMap.put("apple",  "りんご");
		fruitMap.put("peach",  "桃");
		fruitMap.put("banana",  "バナナ");
		fruitMap.put("lemon",  "レモン");
		fruitMap.put("pear",  "梨");
		fruitMap.put("kiwi",  "キウイ");
		fruitMap.put("strawberry",  "いちご");
		fruitMap.put("grape",  "ぶどう");
		fruitMap.put("muscat",  "マスカット");
		fruitMap.put("cherry",  "さくらんぼ");
		
		
		//引数で受け取った「配列checkFruit」の値を辞書で検索する処理
				for (int i = 0; i < arr.length; i++ ) {
					
					//配列 checkFruitの値を変数に代入
					String fruitOne =  arr[i];
					
					//HashuMapのfruitに、配列chekFruit[i]が含まれていた場合＝true
					if (fruitMap.containsKey(fruitOne)) { 
						System.out.println(fruitOne + "の意味は" + fruitMap.get(fruitOne));
					} else {
						//HashuMapのfruitに、配列chekFruit[i]が含まれていない場合
						System.out.println(fruitOne + "は辞書に存在しません");
					}
				}
	}
}


