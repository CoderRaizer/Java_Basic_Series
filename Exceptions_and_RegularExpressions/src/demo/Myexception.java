package demo;

public class Myexception extends Exception {
	String error;

	public Myexception(String error) {
		super();
		this.error = error;
	}

	public String LoiNhapVao() {
		return error;
	}
	// public void setError(String error)
	// {
	// this.error = error;
	// }

}
