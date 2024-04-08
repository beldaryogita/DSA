import java.util.*;
class LLS{
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
			  System.out.println("Key not found.");
			  
			return;
			
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
	public static Scanner sc = new Scanner(System.in);
	
	public static int menuList(){
	System.out.println("0.Exite");	
	System.out.println("1.ADD Node at first");	
	System.out.println("2.add node at last");	
	System.out.println("3.add node at in between using key");	
	System.out.println("4.add node in between using values");
    System.out.println("5.delete node at first position");		
	System.out.println("6.delete node at last positon");
    System.out.println("7.delete node at in between using key ");	
	System.out.println("8.delete node at in between using value");
    System.out.println("9.display");	
	System.out.print("enter choice");
     int choice=sc.nextInt();	
	return choice;
	
	
	}
	
	public static void main(String[] args){
		LL l=new LL();
		int choice;
		while((choice=menuList())!=0 ){
			switch(choice){
				case 1:
				 System.out.print("enter first node");
				 int node=sc.nextInt();
				 push(node);
				break;
				case 2:
				System.out.print("enter last node");
				node=sc.nextInt();
				 illl(node);
				break;
				case 3:
				System.out.print("enter node");
				int data=sc.nextInt();
				System.out.print("enter key");
			    int key=sc.nextInt();
				inBetw(data,key);
				break;
				case 4:
				break;
                case 5:
				break;
				case 6:
				break;	
                case 7:
				break;
				case 8:
				break;
                case 9:display();
                break;			
				}
			
		}
		
	}
	
}