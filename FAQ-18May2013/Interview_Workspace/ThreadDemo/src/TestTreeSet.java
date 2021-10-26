import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author kumadeep
 *
 */
public class TestTreeSet implements Comparable<TestTreeSet>{

	int i;
	public TestTreeSet(int i) {
		this.i = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		TestTreeSet that = (TestTreeSet) obj;
		return this.i == that.i;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestTreeSet t1 = new TestTreeSet(1);
		TestTreeSet t2 = new TestTreeSet(2);
		Set<TestTreeSet> set = new TreeSet<TestTreeSet>();
		set.add(t1);
		set.add(t2);
		
		System.out.println(set.size());
		Iterator<TestTreeSet> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	@Override
	public String toString() {
		return new Integer(i).toString();
	}
	@Override
	public int compareTo(TestTreeSet o) {
		return 0;
	}

}
