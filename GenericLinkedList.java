package linkedlist;
import org.w3c.dom.Node;

/**
 * This class models a generic linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author Aaron McCarley
 * Programming Project 3
 * CS131ON
 */
public class GenericLinkedList<T> {

	private Node head; //node to represent the head of the list
	private Node tail; //node to represent the tail (end) of the list
	private int length = 0; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) node.
	 */
	public GenericLinkedList()
	{
		this.head=null;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head node of the list from which
	 * you can traverse the entire by following node links.
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public GenericNode getList()
	{
		return (GenericNode) head;
	}//end getList
	
	/**
	 * This method adds a new node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	
	
	
	@SuppressWarnings("unchecked")
	public void addNode(Node aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		((GenericNode<T>) tail).setNextNode(null);
		tail=(Node) ((GenericNode<T>) tail).getNextNode();
		((GenericNode<T>) tail).setNextNode(null);
		length++;
		
	}//end addNode

	@Override
	public String toString() {
		return "GenericLinkedList [length=" + length + ", isEmpty()=" + isEmpty() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	
		
	}//end toString

}//end class
