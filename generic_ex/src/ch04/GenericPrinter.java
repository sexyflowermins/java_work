package ch04;
//T 는 Meterial 를 상속 받은 녀석으로 제한
public class GenericPrinter <T extends Meterial>{
	
	private T meterial;

	public T getMaterial() {
		return meterial;
	}

	public void setMaterial(T material) {
		this.meterial = material;
	}
	
	@Override
	public String toString() {
		return meterial.toString();
	}
	
	
}
