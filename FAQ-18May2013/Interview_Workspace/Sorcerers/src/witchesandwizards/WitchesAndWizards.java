package witchesandwizards;

public class WitchesAndWizards {

    public static void main(String[] args) {

		Wizard wizard = new Wizard("Billy" , 5 , 2);
		Witch witch = new Witch("Sue", 6);
		System.out.println("Enter the name, strength and mulligans of the wizard: Billy 5 2");
		
		System.out.println("Battle on Wizard's home field:");
		System.out.println(" 	Wizard : " + wizard.getName() + ", strength : " + wizard.getStrength() + ", Mulligans : " + wizard.getMulligans());
		System.out.println("	Witch : " + witch.getName() + ", strength : " + witch.getStrength());
		wizard.fight(witch);
		
		
		System.out.println("Resulting Values:");
		System.out.println("	" + wizard);
		System.out.println("	" + witch);
	}
    
}
