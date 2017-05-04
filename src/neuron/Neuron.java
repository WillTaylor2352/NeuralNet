package neuron;

import data.*;
 
public class Neuron extends Connections {
	private static final long serialVersionUID = -6816998969748123329L;
	
	Information data;
	Connections conn;
	TypeOfNeuron typeName;
	
	public Neuron(Information data, Connections conn, TypeOfNeuron typeName){
		data = this.data;
		conn = this.conn;
		typeName = this.typeName;
	}
	
	public void setData(Information data){this.data = data;}
	public Information getData(){return this.data;}
	
	public void setConncections(Connections conn){this.conn = conn;}
	public Connections getConnections(){return this.conn;}
	
	public void setTypeName(TypeOfNeuron typeName){this.typeName = typeName;}
	public TypeOfNeuron getTypeName(){return this.typeName;}
	
	
}
