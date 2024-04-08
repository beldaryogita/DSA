class LinkList{

static Node head;
static class Node{
 
int data;
Node link;

Node(int d){
data=d;
link=null;

}}

public static void display(){

Node n = head;
while(n !=null){
  
 System.out.print(n.data+"-->");
  n=n.link;

}
System.out.println("null");
}
//insert node add beging
public static void insert(int Data){
	Node newData=new Node(Data);
    newData.link=head;
    head=newData;
	
	


}
public static void midIn(Node prev,int Data){
	Node newData = new Node(Data);
	newData.link=prev.link;
	prev.link=newData;
	
	
	
}
public void append(int data)
{
	//new node is created
	Node newData = new Node(data);
	//check list is empty ? 
	if(head == null)
		{
			head = newData;
			return;
		}
	//if list is not empty
	newData.next = null;//condition for last node in the list
	
	Node last = head;//traverse ke liya new reference create kiya hai
	//last.next: last node tak le jayega
	while(last.next != null)
	{
		last = last.next;// shifting to next node
	}
	last.next = newData;// connect to new node
	return;
}
	
	
}
public static void main(String[] args){
   LinkList l = new LinkList();
   l.head=new Node(20);
   Node second = new Node(30);
   Node third = new Node(40);
   
  head.link=second;
  second.link=third;
   
  insert(10); 
  midIn(l.head,12);
  display();
  append(20);

}

