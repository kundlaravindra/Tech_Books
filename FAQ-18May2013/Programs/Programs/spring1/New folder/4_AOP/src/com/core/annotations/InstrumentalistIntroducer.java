package com.core.annotations;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class InstrumentalistIntroducer {
	
	@DeclareParents( value="com.core.annotations.Singer+", 
			defaultImpl=com.core.annotations.Guitarist.class
		)
	
	public static Instrumentalist instr;
	
	
	
	

}
