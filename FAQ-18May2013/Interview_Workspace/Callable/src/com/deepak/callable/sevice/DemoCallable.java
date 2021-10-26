package com.deepak.callable.sevice;

import java.util.concurrent.Callable;

import com.deepak.callable.dto.DemoCallableDTO;

public class DemoCallable implements Callable<DemoCallableDTO>{

	@Override
	public DemoCallableDTO call() throws Exception {
		return new DemoCallableDTO(10);
	}

}
