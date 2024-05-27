package kadai_015;

public class Car_Chapter15 {
	
	// フィールド (内部データ)
		private int gear = 0; //ギア
		private int speed = 0; //スピード
		
		// コンストラクト (初期化処理)
		public Car_Chapter15( int gear) {
			this.gear = gear;
			
			//System.out.println("初期ギア" + this.gear );
		}

	//gearChangeメソッド
	public void gearChange(int afterGear) {
		System.out.println( "ギア" + this.gear + "から" + afterGear + "に切り替えました");
		this.gear = afterGear;
	}
	
	
	public void run() {
        this.speed = switch(this.gear) {
        case 1  -> 10;
        case 2  -> 20;
        case 3  -> 30;
        case 4  -> 40;
        case 5  -> 50;
        default -> 10;
    };
    System.out.println("速度は時速" + this.speed + "kmです");
	}

	
}

