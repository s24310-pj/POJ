package kolos4;

public class Buzka implements Rysowalny, PrzedstawiaEmocje {

	public Buzka(char c) {
		
	}
	
	public String toString() {
		return ":-(";
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void draw() {
		
	}

	@Override
	public boolean czySieUsmiecha() {
		return false;
	}
	
	@Override
	public void przestanSieUsmiechac() {
		
	}
	

}
