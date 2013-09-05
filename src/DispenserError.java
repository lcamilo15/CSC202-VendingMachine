
public class DispenserError extends Exception {
	
	private int code;
	public final int ILLEGAL_PRICE = 1;
	public final int ILLEGAL_QUANTITY = 2;
	
	public DispenserError(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
	
}
