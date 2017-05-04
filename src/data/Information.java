package data;

public interface Information{
	static final long serialVersionUID = -3033499014446314938L;

	/**
	 */
	public static Object ShareInfo(){
		// here's where objects are created with the data to be shared
		/* check for a connection to other neurons here (if no connection is open
		 * do not share the information as it will not be comparable to one another)
		 */
		Object o = new Object();
		
		return o;
	}
	
	/**
	 * Where Information will be able to be received when sent from another Neuron
	 * @return 
	 */
	public static void ReceiveInfo(){
		// here's where class variables are edited for receiving information that
		// future generations will be using 
	}
}
