package com.mycollections.linkedList;

public class Node {

public Node(int data) {
		super();
		this.data = data;
	}

int data;
Node next;

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

}
