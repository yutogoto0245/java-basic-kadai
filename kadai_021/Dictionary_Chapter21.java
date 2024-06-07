package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public static HashMap<String, String> getFruit() {
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
		
		//メソッド getFruit();を実行すればHashMapのfruitMapを取得できるようreturnを記載
		return fruitMap;
		
	}

}
