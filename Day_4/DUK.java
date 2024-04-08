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
	
	//insettion using positon
	public static void poW(int data,int pos){
		Node newNode=new Node(data); 
		newNode.next=null;
		Node temp=head;
		Node prev=null;
		/*if(head==null){
			head=newNode;
			return;
		}*/
		if(pos==0){
			newNode.next=head;
			head=newNode;
			return;
			
		}
		for(int i=1;temp!=null && i<pos-1;i++){
			prev=temp;
			temp=temp.next;
			
		}
		if(temp==null){
			prev.next=newNode;
			return;
		}
		else{
			newNode.next=temp.next;
			temp.next=newNode;
		}
		
	}
	
	public static void dF(){
		if(head!=null){
			head=head.next;
			return;
		}
		else{
			System.out.println("list is empty");
		}
	}
	public static void DM(int value){

		if(head==null){
        System.out.println("List is empty");
			return;
		}
		if(head.data==value){
			head=head.next;
			return;
		}
		
		  Node temp=head;
	     Node prev=null;

		while(temp!=null && temp.data!=value){
			prev=temp;
			temp=temp.next;
		}
		if(temp==null){
			System.out.println("key not found");
			return;
		}
		prev.next=temp.next;
	}
	public static void DUK(int key){
		if(head==null){
		System.out.println("empty list");
		return;
		}
		if(key == 0 ){
			head=head.next;
			return;
			
		}
		Node temp=head;
		Node prev=null;
		for(int i=1;temp!=null && i<key-1;i++){
			
			prev=temp;
			temp=temp.next;
			
		}
		if(temp==null){
			System.out.println("Key not found");
			return;
		}
		prev.next=temp.next;
		
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
      //  l.display();
        l.illl(1);	  
       // l.display();
        l.inBetw(50,20);//usigng key
		//l.display();
		//l.poW(65,1);
		l.poW(65,0);
		l.display();
		//delete first element 
		//l.dF();
		//l.display();
		//delete mid element
		l.DM(20);
		l.display();
		l.DUK(0);
		l.display();
	}
	
	
	
}