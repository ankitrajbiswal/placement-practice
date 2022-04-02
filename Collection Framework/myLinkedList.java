public class myLinkedList {
    //Implementation of Linked List
    Node head;
    void add(int data){
        Node toAdd=new Node(data);
        if(isEmpty()){
            head=toAdd;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=toAdd;
    }
    boolean isEmpty(){
        if(head==null)
        return true;
     else
        return false;
    }
    
}
 class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}

