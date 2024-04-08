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
  
 System.out.println(n.data);
  n=n.link;


}

}
public static void main(String[] args){
   LinkList l = new LinkList();
   l.head=new Node(20);
   Node second = new Node(30);
   Node third = new Node(40);
   
  head.link=second;
  second.link=third;
   
  display();

}

}