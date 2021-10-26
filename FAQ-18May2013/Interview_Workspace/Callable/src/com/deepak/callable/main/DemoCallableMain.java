package com.deepak.callable.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.deepak.callable.dto.DemoCallableDTO;
import com.deepak.callable.sevice.DemoCallable;

public class DemoCallableMain {

	public static void main(String[] args){
		
		DemoCallable dc = new DemoCallable();
		try {
			System.out.println(dc.call().getI());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		try {
			es.submit(new DemoCallable()).get().getI();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FutureTask<DemoCallableDTO> fu = new FutureTask<>(dc);
		
	}
}
