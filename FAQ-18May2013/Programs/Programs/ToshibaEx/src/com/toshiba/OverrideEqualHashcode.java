package com.toshiba;

public class OverrideEqualHashcode {

    private double re;
    private String im;
 
    public OverrideEqualHashcode(double re, String im) {
        this.re = re;
        this.im = im;
    }
  
    @Override
    public int hashCode() {
    	int hash = 7;
    	hash = 31 * hash + (int)re;
    	hash = 31 * hash + (null == im ? 0 : im.hashCode());
    	return hash;
    }
   
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if( o == null || (o.getClass() != this.getClass() )) {
        //if (!(o instanceof OverrideEqualHashcode)) {
            return false;
        }
        OverrideEqualHashcode c = (OverrideEqualHashcode) o;
        return Double.compare(re, c.re) == 0
                && im.equals(c.im) == true;
    }
}