package Semafoare;

public final class SemBin extends Semafor{

	public SemBin() {
		super();
	}
	
	public SemBin(int initial) {
		super(initial);
		if(initial > 1)
			throw new IllegalArgumentException("Initial > 1");
	}
	
	public SemBin(boolean initial) {
		super(initial ? 1 : 0);
	}
	
	public final synchronized void sem_post() {
		super.sem_post();
		
		if(this.value > 1)
			this.value = 1;
	}
	
}
