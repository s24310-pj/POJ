package zadanie4;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc {
	
	int bok1, bok2;

	public Prostokat(int i, int j) {
		bok1 = i;
		bok2 = j;
	}
	
	public String toString() {
		return "prostokat";
	}

	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public double przekatna() {
		
		return Math.sqrt((bok1 * bok1) + (bok2 * bok2));
	}

	@Override
	public double katNachylenia() {
		
		return Math.PI / 2;
	}

	@Override
	public double bok() {
		
		return 1;
	}

	@Override
	public double podstawa() {
		
		return 1;
	}

	@Override
	public double wysokosc() {
		
		return 1;
	}
	
	@Override
	public int wielokrotnoscPrzekatnej(int i) {
		
		return (int) (Math.sqrt((bok1 * bok1) + (bok2 * bok2)) * i);
	}

	@Override
	public double wielokrotnoscPrzekatnej(double d) {
		
		return Math.sqrt((bok1 * bok1) + (bok2 * bok2)) * d;
	}
	
	

}
