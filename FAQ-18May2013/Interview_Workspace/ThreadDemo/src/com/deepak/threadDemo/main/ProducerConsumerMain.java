/**
 * 
 */
package com.deepak.threadDemo.main;

import com.deepak.threadDemo.resource.Resource;
import com.deepak.threadDemo.thread.Consumer;
import com.deepak.threadDemo.thread.ConsumerAll;
import com.deepak.threadDemo.thread.Even;
import com.deepak.threadDemo.thread.Odd;
import com.deepak.threadDemo.thread.Producer;
import com.deepak.threadDemo.thread.ProducerAll;

/**
 * @author kumadeep
 *
 */
public class ProducerConsumerMain {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Resource resource = new Resource();
		
		/*Thread t1 = new Thread(new Producer(resource));
		Thread t2 = new Thread(new Consumer(resource));
		Thread t3 = new Thread(new ProducerAll(resource));
		Thread t4 = new Thread(new ConsumerAll(resource));*/
		Odd odd = new Odd(resource);
		Even even = new Even(resource);
		
		odd.start();
		//odd.join();
		even.start();
		//t1.start();
		//t2.start();
		//t3.start();
		//t4.start();
	}

}
