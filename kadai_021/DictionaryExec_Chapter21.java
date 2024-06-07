package kadai_021;

import java.util.HashMap;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//System.out.println(dictionary.get("apple"));
		
		String[] checkFruit = {"apple", "banana", "grape", "orange"};
		
		
		//System.out.println(dictionary.get("apple"));
		
	
		
		//配列checkFruitの値を辞書で検索する処理
		for (int i = 0; i < checkFruit.length; i++ ) {
			
			//親クラスのHashMapを取得する
			HashMap<String, String> fruit = dictionary.getFruit();
			
			//配列 checkFruitの値を変数に代入
			String fruitOne =  checkFruit[i];
			
			//HashuMapのfruitに、配列chekFruit[i]が含まれていた場合＝true
			if (fruit.containsKey(fruitOne)) { 
				System.out.println(fruitOne + "の意味は" + fruit.get(fruitOne));
			} else {
				//HashuMapのfruitに、配列chekFruit[i]が含まれていない場合
				System.out.println(fruitOne + "は辞書に存在しません");
			}

		}
	}

}
