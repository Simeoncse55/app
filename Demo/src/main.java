import Banking.Transcation;
public class main {
   public static void main(String[] args) {
		demo demo = new demo();
		demo.a = 10;
		demo.display();
		System.out.println("hello");
		Transcation obj = new Transcation();
		System.out.println("amount value before changing : " + obj.amount);
		obj.amount = 50;
		System.out.println("amount value after changing : " + obj.amount);
	}
}
