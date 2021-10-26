package witchesandwizards;

import java.util.List;

public class Wizard extends Sorcerer{
	
	private int mulligans;

	public Wizard() {
		super();
	}
	
	public Wizard(String initName, double initStrength, int mulligans) {
		super(initName ,initStrength);
		if(mulligans <= 5 && mulligans >= 0){
			this.mulligans = mulligans;
		}
	}

	public int getMulligans() {
		return mulligans;
	}
	
	public void fight(Sorcerer sorcerer){
		
		Round home = FightUtil.homeRoundResult();
		Round visitor = FightUtil.visitorRoundResult();
		
		Round result = FightUtil.fightResult(home, visitor);
		
		if(result == null){
			System.out.println("home : " + this.getName() + " : " + home.toString());
			System.out.println("visiotr : " + sorcerer.getName() + " : " + visitor.toString());
			System.out.println("result : tie");
			fight(sorcerer);
		}else if(result.toString().equalsIgnoreCase(home.toString())){
			
			System.out.println("home : " + this.getName() + " : " + home.toString());
			System.out.println("visiotr : " + sorcerer.getName() + " : " + visitor.toString());
			this.takeStrength(sorcerer);
			System.out.println("result : home win");
			
		}else if(result.toString().equalsIgnoreCase(visitor.toString())){
			System.out.println("home : " + this.getName() + " : " + home.toString());
			System.out.println("visiotr : " + sorcerer.getName() + " : " + visitor.toString());
			sorcerer.takeStrength(this);
			System.out.println("result : visitor win");
			if(this.getMulligans() >= 0){
				System.out.println("Mulligan!!!! Fight again!!!!");
				this.mulligans=this.getMulligans()-1;
				fight(sorcerer);
			}
		}
	}
	
	@Override
	public String toString() {
		return "wizard : " + this.getName()+ ", Strength : " + this.getStrength() + ", Mulligans : " + this.mulligans;
	}
}
