package com.core.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Artist {
	
	@Autowired
	@StringedInstrument
	Instrument instrument;

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	

}
