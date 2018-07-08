package com.CesarParedes.ForkJoin;

import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction {
	
	private int simulatedWork;
	
	public SimpleRecursiveAction(int simulatedWork) {
		this.simulatedWork = simulatedWork;
	}

	protected void compute() {
		
		if(simulatedWork > 100 ) {
			System.out.println("Parallel execution and split task..." + simulatedWork);
			
			SimpleRecursiveAction simpleRecursiveAction1 = new SimpleRecursiveAction(simulatedWork/2);
			SimpleRecursiveAction simpleRecursiveAction2 = new SimpleRecursiveAction(simulatedWork/2);
			
			simpleRecursiveAction1.fork();
			simpleRecursiveAction2.fork();
		}else {
			System.out.println("No need for parallel execution, sequential algo is ok" + simulatedWork);
			
		}
		// TODO Auto-generated method stub
		
	}
	

}
