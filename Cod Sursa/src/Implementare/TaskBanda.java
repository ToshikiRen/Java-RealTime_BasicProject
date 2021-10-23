package Implementare;

import java.util.TimerTask;

public class TaskBanda extends TimerTask {
	
	int state = 0;
	static int initial = 0;
	
	public TaskBanda(int state)
	{
		this.state = state;
	}
	
	public TaskBanda()
	{
		this.state = 0;
	}
	
	@Override
	public void run() {
		
		if(initial != 0) {
			synchronized(this) {
				System.out.println("Oprire banda");
				this.state = 0; // Oprire banda
			}

		}
		else
			initial = 1;
		
		GVL.S0.sem_post();
		GVL.S1.sem_post();
		
		GVL.S2.sem_wait();
		GVL.S2.sem_wait();
		
		synchronized(this) {
			System.out.println("Repornire banda");
			this.state = 1; // Repornire banda
		}
		
		
	}
	
	
}
