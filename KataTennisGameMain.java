
public class KataTennisGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			KataTennisGame object = new KataTennisGame(5,7);
			KataTennisGame object2 = new KataTennisGame(7,7);
			KataTennisGame object3 = new KataTennisGame(2,1);
			KataTennisGame object4 = new KataTennisGame(0,0);
			KataTennisGame object5 = new KataTennisGame(7,5);
			KataTennisGame object6 = new KataTennisGame(4,3);

			System.out.println(object.getScore());
			System.out.println(object2.getScore());
			System.out.println(object3.getScore());
			System.out.println(object4.getScore());
			System.out.println(object5.getScore());
			System.out.println(object6.getScore());

		}

}
