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
	//in betweein using key
	public static void inBetw(int data,int preKey){
		Node newNode = new Node(data);
		newNode.next=null;
		Node temp=head;
		Node prev=null;
		if(head==null){
			head=newNode;
			return;
		}
		while(temp!=null && preKey!=temp.data){
			prev=temp;
			temp=temp.next;
			
			
		}
		if(temp==null){
			prev.next=newNode;
			
		}
		else{
		newNode.next=temp.next;
		
		temp.next=newNode;
		}
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
        l.inBetw(50,20);//usigng key
       		
		l.display();
	}
	
	
	
}