package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//System.out.println(dictionary.get("apple"));
		
		String[] checkFruit = {"apple", "banana", "grape", "orange"};
		
		//親クラスのメソッドgetFruit()に、配列を引数として渡す
		dictionary.getFruit(checkFruit);
		
	}
}


