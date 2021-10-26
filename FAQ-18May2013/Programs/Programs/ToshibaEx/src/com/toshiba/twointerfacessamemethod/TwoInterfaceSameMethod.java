package com.toshiba.twointerfacessamemethod;

public class TwoInterfaceSameMethod implements One,Two {
public void Color(){
System.out.println("Common to all");
}
public One Choose(One o){
	//System.out.println("hi......");
return new One(){
public void Color(){
System.out.println("Color One");
}
/*public int Color(){
System.out.println("Color One");
return 1;
}*/

};
}
public Two Choose(Two o){
return new Two(){
public void Color(){
System.out.println("Color Two");
}
};
}
}