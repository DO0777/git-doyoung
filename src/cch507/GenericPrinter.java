package cch507;

public class GenericPrinter<T extends Material> {
	
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
