package com.github.wgy.basic;


public class ArrayList implements List {
	
	private int size = 0;

	
	private Object[] elementData = new Object[100];
	
	public void add(Object o){
		checkMaxSize(size+1);
		elementData[size++] = o;
		size++;
	}
	private void checkMaxSize(int checksize) {
		if(checksize>=elementData.length){
			throw new RuntimeException("长度越界");
		}
		
	}
	public void add(int index, Object o){
		
	}
	
	public Object get(int index){
		return null;
	}
	
	public Object remove(int index){
		return null;
	}
	
	public int size(){
		return -1;
	}
	
	public Iterator iterator(){
		return null;
	}
	
}

