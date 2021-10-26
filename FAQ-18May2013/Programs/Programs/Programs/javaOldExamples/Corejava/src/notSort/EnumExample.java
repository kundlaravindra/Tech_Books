package notSort;
 enum Day {Monday,TuesDay, WednusDay}; 
 class EnumsExample {
	public Day Day;
	EnumsExample(Day Day){
		this.Day=Day;
	}
public void dayTest(){
	switch(Day){
	case Monday :System.out.println("today is monday");
	break;
	case TuesDay :System.out.println("to day is tuesday");
	break;
	 default:System.out.println("it is not a day");
	break;
	
	}}

 }
public class EnumExample {
public static void main(String[] args) {
	EnumsExample e=new EnumsExample(Day.Monday);
 e.dayTest();
	}

}
