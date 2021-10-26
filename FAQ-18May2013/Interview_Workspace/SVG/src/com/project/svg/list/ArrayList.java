package com.project.svg.list;


public class ArrayList<T> {
	private int maxSize;
	private int size;
	private int current;
	private T[] data;

	public ArrayList(int n) {
		maxSize = n;
		size = 0;
		current = -1;
		data = (T[]) new Object[maxSize];
	}

	public boolean empty() {
		return size == 0;
	}

	public boolean full() {
		return size == maxSize;
	}

	public void findFirst() {
		current = 0;
	}

	public void findNext() {
		current++;
	}

	public boolean last() {
		return current == size - 1;
	}

	public T retrieve() {
		return data[current];
	}

	public void update(T val) {
		data[current] = val;
	}

	public void insert(T val) {
		for (int i = size - 1; i > current; i--) {
			data[i + 1] = data[i];
		}
		current++;
		data[current] = val;
		size++;
	}

	public void remove() {
		for (int i = current + 1; i < size; i++) {
			data[i - 1] = data[i];
		}
		size--;
		if (size == 0)
			current = -1;
		else if (current == size)
			current = 0;
	}
}
