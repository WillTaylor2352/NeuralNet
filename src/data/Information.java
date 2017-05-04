package data;

public class Information extends Connections{
	private static final long serialVersionUID = -3033499014446314938L;

	public Information ShareInfo(){
		// here's where objects are created with the data to be shared
		/* check for a connection to other neurons here (if no connection is open
		 * do not share the information as it will not be comparable to one another)
		 */
		Information o = new Information();
		
		return o;
	}
	
	public void ReceiveInfo(){
		// here's where class variables are edited for receiving information that
		// future generations will be using 
	}
}
