package Classes;

public enum EnumColor {
	RED(0, "R", "Red"), YELLOW(1, "Y", "Yellow"), GREEN(2, "G", "GREEN");

	private int priority;
	private String colorCode;
	private String colorName;

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	private EnumColor(int priority, String colorCode, String colorName) {
		this.priority = priority;
		this.colorCode = colorCode;
		this.colorName = colorName;
	}

}
