package kadai_018;

public abstract class Kato_Chapter18 {
	
	public String familyName; //姓を表す
	public String givenName;  //名を表す
	public String address;    //住所を表す

	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	abstract void eachIntroduce();
	
	
	public void execIntroduce() {
	commonIntroduce();
	eachIntroduce();
	}
}