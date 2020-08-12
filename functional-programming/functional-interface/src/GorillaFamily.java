
public class GorillaFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GorillaFamily gorillaFamily = new GorillaFamily();
		
		gorillaFamily.play(() -> "hey");
		
	}
	
	void play(Gorilla g) {
		System.out.println(g.move());
	}
	

}
