class LL{
	
	
	static Node head;
	
	public static class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
		
	}
	
    
	public static void push(int data){
		Node newNode = new Node(data);
		if(head!=null){
			newNode.next=head;
		}
		head=newNode;
		
	}
	public static void illl(int data){
		
		Node newNode = new Node(data);
		newNode.next=null;
		if(head==null){
		 head=newNode;
		 return ;
		
		}
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
			
		}
		temp.next=newNode;
	
		
		
	}
	
	
	
	public static void display(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.println("END");
	}
	
	
	public static void main(String[] args){
		LL l=new LL();
		l.push(20);
		l.push(20);
        l.push(20);	
        l.display();
        l.illl(1);	  
        l.display();		
		
	}
	
	
	
}