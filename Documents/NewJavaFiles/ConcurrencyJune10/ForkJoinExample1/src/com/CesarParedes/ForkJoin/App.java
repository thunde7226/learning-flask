package com.CesarParedes.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are going to define the number of processors
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(20);
		pool.invoke(simpleRecursiveAction);

	}

}
