package com.deepak.cb;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicThread implements Runnable{

	private CyclicBarrier cb;
	
	public CyclicThread(CyclicBarrier cb) {
		this.cb = cb;
	}
	
	@Override
	public void run() {

		try {
            System.out.println(Thread.currentThread().getName() + " is waiting on barrier");
            
            this.cb.await();
            //this.cb.reset();
           // this.cb.reset();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier");
        } catch (InterruptedException ex) {
        	ex.printStackTrace();
        } catch (BrokenBarrierException ex) {
        	ex.printStackTrace();
        }

	}

}
