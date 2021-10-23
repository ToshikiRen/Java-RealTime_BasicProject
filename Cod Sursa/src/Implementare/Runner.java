package Implementare;

import java.util.Timer;

import Semafoare.SemBin;
import Semafoare.Semafor;



public class Runner {
	



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t_umplere = 1000 * 2;
		int t_dop = 1000 * 5;
		int t_detectare = 1000 * 15;
		
		TaskUmplere T1 = new TaskUmplere("umplere a sticlei", t_umplere);
		TaskDop T2 = new TaskDop("adaugare a dopului", t_dop);
		TaskBanda T3 = new TaskBanda();
		
		
		Timer timer_banda = new Timer();
		timer_banda.schedule(T3, 0, t_detectare);
		T1.start();
		T2.start();
		
	}

}
