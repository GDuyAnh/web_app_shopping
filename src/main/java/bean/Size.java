package bean;

public enum Size {
	S,
	M,
	L,
	XL,
	XXL;
	
	public Catalory getvalue ( int catelogy) {
		return Catalory.values()[catelogy];
	}
	

}
