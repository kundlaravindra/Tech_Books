package com.toshiba.twointerfacessamemethod;


public class MainForTwoInterfaceSameMethod {

public static void main(String[] args) {
TwoInterfaceSameMethod c= new TwoInterfaceSameMethod();
c.Color();
One o= new TwoInterfaceSameMethod();
Two t= new TwoInterfaceSameMethod();
o=c.Choose(o);
t=c.Choose(t);
c.Choose(o);
o.Color();
t.Color();
}
}
