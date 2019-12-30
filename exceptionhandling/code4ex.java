package exceptionhandling;

public class code4ex extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String str;
	public code4ex(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		if(str==null)
			return "ab ha";
		else 
			return str;

	}
	public code4ex(){}
	
	

}
