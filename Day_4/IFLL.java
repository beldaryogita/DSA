//insertion at first in link list


class LL{
	
	static Node head;
public static class  Node{
	
	int data;
	Node next;
    
	private Node(){
		
	}
    private Node(int d){
		data=d;
		next=null;
	
		
	}	
	
}
public static void push(int newData){
	Node newNode= new Node(newData);
	if(head!=null)
		newNode.next=head;
	
	head =newNode;
}
public  void display(){
	Node n=head;
	while(n!=null){
		System.out.print(n.data+"-->");
		n=n.next;
	}
	System.out.println("END");
}

	
public static void main(String[] args){
		LL l=new LL();
		//l.head=new Node();
		l.push(30);
		l.push(40);
		l.push(50);
		l.push(60);
		l.display();
	}
	
}