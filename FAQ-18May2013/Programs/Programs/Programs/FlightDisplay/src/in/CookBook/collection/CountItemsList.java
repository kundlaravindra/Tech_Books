package in.CookBook.collection;

import java.util.*;

public class CountItemsList<E> extends ArrayList<E> { 
   private Map<E,Integer> count = new HashMap<E,Integer>();
    public boolean add( E element  ) { 
        if( !count.containsKey( element ) ){
            count.put( element, 1 );
        } else { 
            count.put( element, count.get( element ) + 1 );
        }
        return super.add( element );
    }
    public int getCount( E element ) { 
        if( ! count.containsKey( element ) ) {
            return 0;
        }
        return count.get( element );
    }
    public static void main( String [] args ) { 
        List<String> animals = new CountItemsList<String>();
        animals.add("bat");
        animals.add("owl");
        animals.add("bat");
        animals.add("bat");

        System.out.println( (( CountItemsList<String> )animals).getCount( "owl" ));
    }
}