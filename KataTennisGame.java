public class KataTennisGame {
	
	private int scoreOne;
	private int scoreTwo;
	
	// constructor
	public KataTennisGame(int playerOneScore, int playerTwoScore){
		this.scoreOne = playerOneScore;
		this.scoreTwo = playerTwoScore;
	}
	
	// check if we have Deuce
	public boolean isDeuce(){
		
		if(scoreOne >= 3 && scoreTwo == scoreOne)
			return true;
		else
			return false;
	}
	
	// check if we have winner 
	public boolean checkWinner() {
		
		if(scoreOne >= 4 && scoreOne >= scoreTwo + 2)
			return true;
		if(scoreTwo >= 4 && scoreTwo >= scoreOne + 2)
			return true;
		
		return false;

	}
	
	private boolean checkAdvantage() {
		
		if (scoreOne >= 4 && scoreOne == scoreTwo + 1)
			return true;
		if (scoreTwo >= 4 && scoreTwo == scoreOne + 1)
			return true;
		
		return false;

	}
	

	
	private String scoreMeaning(int score){
		
		String scorePoint = "";
		
		if(score == 0){
			scorePoint = "Love";
		}
		else if(score == 1){
			scorePoint = "Fifteen";
		}
		else if(score == 2){
			scorePoint = "Thirty";
		}
		else if(score == 3){
			scorePoint = "Forty";
		}
		
		return scorePoint;
				
	}
	
	public String getScore(){
		
		 if(checkWinner()){
			 if (scoreOne > scoreTwo) {
					return "Player one is the winner";
				} else {
					return "Player two is the winner";
				}
		 } 
		 if(checkAdvantage()){
			 if (scoreOne > scoreTwo) {
					return "Player one has advantage";
				} else {
					return "Player two has advantage";
				}
		 }
		 if(isDeuce())
			 return "Deuce";
		 
		 if(scoreOne == scoreTwo)
			 return scoreMeaning(scoreOne);
		 
		 return scoreMeaning(scoreOne) + "-" + scoreMeaning(scoreTwo);
	}
	

}