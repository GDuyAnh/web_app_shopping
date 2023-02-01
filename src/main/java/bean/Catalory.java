package bean;

public enum Catalory {
	ALL,
	SHOES,
	SHIRT,
	TROUSERS,
	CAPS;
	
	public Catalory getvalue ( int catelogy) {
		return Catalory.values()[catelogy];
	}

	
}
