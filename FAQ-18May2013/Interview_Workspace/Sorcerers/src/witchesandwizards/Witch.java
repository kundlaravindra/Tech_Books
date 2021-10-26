package witchesandwizards;

public class Witch extends Sorcerer{

	public Witch() {
		super();
	}
	
	public Witch(String initName, double initStrength) {
		super(initName,initStrength);
	}
	
	public void fight(Sorcerer sorcerer){
		Round home = FightUtil.homeRoundResult();
		Round visitor = FightUtil.visitorRoundResult();
		
		Round result = FightUtil.fightResult(home, visitor);
		
		if(result == null){
			System.out.println("home : " + this.getName() + " : " + home.toString());
			System.out.println("visiotr : " + sorcerer.getName() + " : " + visitor.toString());
			System.out.println("tie");
			
			fight(sorcerer);
		}else if(result.toString().equalsIgnoreCase(home.toString())){
			
			System.out.println("home : " + this.getName() + " : " + home.toString());
			System.out.println("visiotr : " + sorcerer.getName() + " : " + visitor.toString());
			System.out.println("home win");
			this.takeStrength(sorcerer);
		}else if(result.toString().equalsIgnoreCase(visitor.toString())){
			System.out.println("home : " + this.getName() + " : " + home.toString());
			System.out.println("visiotr : " + sorcerer.getName() + " : " + visitor.toString());
			System.out.println("visitor win");
			sorcerer.takeStrength(this);
		}
	}
	
	@Override
	public String toString() {
		return "Witch : " + this.getName()+ ", Strength : " + this.getStrength();
	}
	
}
