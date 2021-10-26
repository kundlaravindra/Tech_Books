package com.sun;

public class PrivateInteface {
	void sum() {
		// sum2();
return ;
	}

	private interface Own {
		void sum2(Object newParam);

	}

	class Private implements Own {
		/* (non-Javadoc)
		 * @see com.sun.PrivateInteface.Own#sum2(java.lang.Object)
		 */
		public void sum2(Object newParam) {
			System.out.println("vinod");

		}

	}

}
