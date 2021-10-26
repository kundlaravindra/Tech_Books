/**
 * 
 */
package com.deepak.random.producerConsumer;

/**
 * @author indkumar07
 *
 */
public class ProducerConsumerMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Resource resource = new Resource();
		new Producer(resource);
		new Consumer(resource);
	}

}
