/**
 * 
 */
package witchesandwizards;

/**
 * @author kumadeep
 *
 */
public class FightUtil {

	public static Round fightResult(Round home,Round away){
		
		if(home.toString().equalsIgnoreCase(Round.PAPER.toString())){
			
			if(away.toString().equalsIgnoreCase(Round.SCISSORS.toString())){
				return away;
			}
			if(away.toString().equalsIgnoreCase(Round.STONE.toString())){
				return home;
			}
		}
		
		if(home.toString().equalsIgnoreCase(Round.SCISSORS.toString())){
			
			if(away.toString().equalsIgnoreCase(Round.PAPER.toString())){
				return home;
			}
			if(away.toString().equalsIgnoreCase(Round.STONE.toString())){
				return away;
			}
		}
		
		if(home.toString().equalsIgnoreCase(Round.STONE.toString())){
			
			if(away.toString().equalsIgnoreCase(Round.SCISSORS.toString())){
				return home;
			}
			if(away.toString().equalsIgnoreCase(Round.PAPER.toString())){
				return away;
			}
		}
		
		return null;
	}
	
	
	public static Round homeRoundResult(){
		int random = ((int) (Math.random()*100))%5;
		//System.out.println(random);
		
		if(random == 1|| random ==2){
			//System.out.println(Round.PAPER.toString());
			return Round.PAPER;
		}else if(random ==3 || random == 4){
			//System.out.println(Round.STONE.toString());
			return Round.STONE;
		}else{
			//System.out.println(Round.SCISSORS.toString());
			return Round.SCISSORS;
		}
	}
	
	public static Round visitorRoundResult(){
		int random = ((int) (Math.random()*100))%5;
		//System.out.println(random);
		
		if(random == 1|| random ==2){
			//System.out.println(Round.SCISSORS.toString());
			return Round.SCISSORS;
		}else if(random ==3 || random == 4){
			//System.out.println(Round.STONE.toString());
			return Round.STONE;
		}else{
			//System.out.println(Round.PAPER.toString());
			return Round.PAPER;
		}
	}
}
