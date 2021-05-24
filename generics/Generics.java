package generics;

public class Generics<T> {
	//private String carbrand
	private T t;
	
	//getters
	public T get() {
		return this.t;
	}
	
	//setters
	public void set(T t1) {
		this.t = t1;
		}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Generics<String> type = new Generics<>();
		type.set("Adi");
		System.out.println(type.get());
		
		@SuppressWarnings("rawtypes")
		Generics type1 = new Generics();
		type1.set("Adi");
		type1.set(2);
	}
}
