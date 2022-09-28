package cch506;

public class GenericPrinter<T> {
	
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void serMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}

}
