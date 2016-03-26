package com.acadglid.java.core.session8.assignment4;

public class CheckMainThreadStatus implements Runnable {
	static int count=1;
	Thread t1;
	/*Contructor where the Thread is created and started. */
	public CheckMainThreadStatus(){
		System.out.println("my thread "+Thread.currentThread());
		/* Thread is created inside while loop to create the desired result*/
		while(count<10 ){
			t1=new Thread(this);
			t1.start();
			/* checking the status of the current child thread*/
			if(t1.isAlive()){
				System.out.println("Main thread will be alive till the child thread is live ");
			}
		
		}
		if(count > 10){
			System.out.println("My thread run is over ");
		}
		
	
		
	}
	//run() method of Thread class, that is overridden, and it increments a static count variable by one for each execution.
	public void run(){
		
		for(;count<=10;count++){
			System.out.println("Printing the count "+count);
		
	}

	
}


}