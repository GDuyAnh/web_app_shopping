package bean;

public enum Color {
	WHITE,
	BLACK,
	BLUE,
	RED,
	ORANGE,
	YELLOW,
	SILVER,
	PINK;
	public Catalory getvalue ( int catelogy) {
		return Catalory.values()[catelogy];
	}

}
