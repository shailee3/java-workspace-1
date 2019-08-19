public class Cargo {
	private String name;
	private String description;
	private double width;
	private double length;
	public Cargo() {}
	public Cargo(String name, String description, double length, double width) {
		this.name = name;
		this.description = description;
		this.width = width;
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
}