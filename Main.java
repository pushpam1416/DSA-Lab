class Node{
	int data;
	Node next;
	
Node(int value) {
	data = value;
	next = null;
	}
}
class SinglyLinkedList {
	Node head = null;
	
public void insertEnd(int value) {
	Node newnode = new Node(value);
	
	if (head == null) {
	head = newnode;
	return;
	}
	
	Node temp = head;
	while(temp.next != null) {
		temp = temp.next;
		}
	temp.next = newnode;
	}

public void deleteBegin() {
	if (head == null) {
		System.out.println("List is empty");
			return;
			}
		head = head.next;
		}
		
public void display() {
	if(head == null) {
		System.out.print("Linked list is empty ");
		return ; 
		}
	Node temp = head ; 
	while(temp != null){
	System.out.print(temp.data+"->");
		temp = temp.next ;
	} 
	System.out.print("null");
	System.out.println();
	}
}
public class Main {
	public static void main(String[] args) {
	SinglyLinkedList list = new SinglyLinkedList();

	list.insertEnd(10);
	list.insertEnd(20);
	list.insertEnd(30);		
	System.out.print("Linked List : ");
list.display();
list.deleteBegin();

	System.out.print("After Deletion :");
	list.display();
	}
}

