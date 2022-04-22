package zadanie4;

public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna {

	public Kwadrat(int i, int j) {
		super(i, j);
		
	}

	public Kwadrat(int i) {
		super(i, i);
	}
	
	public String toString() {
		return "kwadrat";
	}

}
