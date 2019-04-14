package comparision.trial;

public class Laptop implements Comparable<Laptop> {

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	private String brand;
	private int ram;
	private int size;
	@Override
	public int compareTo(Laptop arg0) {
		
		return this.getBrand().compareTo(arg0.getBrand());
	}
	public Laptop(String brand, int ram, int size) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", size=" + size + "]";
	}
	
}
