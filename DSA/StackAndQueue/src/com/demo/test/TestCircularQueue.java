package com.demo.test;

import com.demo.queue.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		MyCircularQueue Qc=new MyCircularQueue(5);
	
		Qc.enqueue(10);
		Qc.enqueue(11);
		Qc.enqueue(12);
		Qc.enqueue(13);
		Qc.enqueue(14);
		System.out.println("Data:"+Qc.dequeue());
		Qc.enqueue(15);
		Qc.enqueue(20);
		System.out.println("Data:"+Qc.dequeue());
		System.out.println("Data:"+Qc.dequeue());
		Qc.enqueue(22);
		Qc.enqueue(25);
		System.out.println("Data:"+Qc.dequeue());
		System.out.println("Data:"+Qc.dequeue());
		System.out.println("Data:"+Qc.dequeue());
		System.out.println("Data:"+Qc.dequeue());
		Qc.enqueue(100);
		Qc.enqueue(200);
	}

}
