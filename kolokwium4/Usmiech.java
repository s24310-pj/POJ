package kolos4;

public class Usmiech extends Buzka implements Skalowalny {

	public Usmiech() {		
		super(')');
	}
	
	public String toString() {
		return ":-)";
	}
	
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public void draw() {
		
	}

	@Override
	public void draw(int times) {
		
	}
	
	@Override
	public boolean czySieUsmiecha() {
		return true;
	}





}
