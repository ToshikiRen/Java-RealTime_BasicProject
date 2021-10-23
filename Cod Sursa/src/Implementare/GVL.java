package Implementare;

import Semafoare.SemBin;
import Semafoare.Semafor;

public interface GVL {
	public static Semafor S2 = new Semafor();
	public static SemBin  S0 = new SemBin();
	public static SemBin  S1 = new SemBin();
}
