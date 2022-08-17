package linkedlist;

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * @author Aaron McCarley
 * Programming Project 3 
 * CS131ON
 */
public class GenericNode<T> {
	
	private String data;  //data that the object stores
	private GenericNode <T> nextNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		this.nextNode = null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(String data) {
		this.data= data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public String getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public GenericNode getNode() {
		return this;
	}//end getNode
	/**
	 * This method updates the pointer for the next node.
	 * @param aNode
	 */
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	/**
	 * This method returns the node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode<T> getNextNode() {
		return nextNode;
	}//end getNextNode

	@Override
	public String toString() {
		return "GenericNode [getData()=" + getData() + ", getNode()=" + getNode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}//end toString
		
}//end class


