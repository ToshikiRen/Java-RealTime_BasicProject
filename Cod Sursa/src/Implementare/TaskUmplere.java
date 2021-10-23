package Implementare;

public class TaskUmplere extends Thread {

	private String task_name;
	private int task_time;
	
	public TaskUmplere(String task_name, int task_time)
	{
		this.task_name = task_name;
		this.task_time = task_time;
	}
	
	public TaskUmplere()
	{
		this.task_name = "Default_Name";
		this.task_time = 1000;
	}
	
	@Override 
	public void run()
	{
		while(true)
		{
			
			GVL.S0.sem_wait();
			System.out.println("A inceput task-ul de " + task_name);
			
			try {
				TaskUmplere.sleep(task_time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("S-a terminat task-ul de " + task_name);
			GVL.S2.sem_post();
			
		}
	}
}
