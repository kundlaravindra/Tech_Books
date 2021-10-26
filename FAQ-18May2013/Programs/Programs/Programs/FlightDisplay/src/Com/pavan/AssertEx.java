package Com.pavan;

public class AssertEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i = 2; i < 4; i++)
    	for(int j = 2; j < 4; j++)
    	if(i < j)
    	assert i!=j : i;
	}

}
