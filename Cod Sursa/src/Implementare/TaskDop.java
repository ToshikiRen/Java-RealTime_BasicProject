package Implementare;

public class TaskDop extends Thread {

	private String task_name;
	private int task_time;
	
	public TaskDop(String task_name, int task_time)
	{
		this.task_name = task_name;
		this.task_time = task_time;
	}
	
	public TaskDop()
	{
		this.task_name = "Default_Name";
		this.task_time = 1000;
	}
	
	@Override 
	public void run()
	{
		while(true)
		{
			
			GVL.S1.sem_wait();
			
			System.out.println("A inceput task-ul de " + task_name);
			
			try {
				TaskDop.sleep(task_time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("S-a terminat task-ul de " + task_name);
			GVL.S2.sem_post();
			
		}
	}
}
