package kosta.controller;

public class OrderController {
	public void orderInsert() {
		System.out.println("order 브랜치에서 추가함");
	}

	
	public void orderCart() {
		System.out.println("로컬 cart 브랜치에서 추가함.");
	}

	public void remoteCart() {
		System.out.println("원격 main 브랜치에서 추가함.");

	}
	
	public void orderMember() {
		System.out.println("로컬 member 브랜치에서 추가함.");
	}
}
