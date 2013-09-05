
public class VendingMachineError extends Exception {
	
	private int code;
	public final int SOLD_OUT = 1;
	public final int INSUFFICIENT_FUNDS = 2;
	
	public VendingMachineError(int code, String message) {
		super(message);
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}

}
