class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void printLinkedList( ){
        Node curr =this.head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    void add(int data){
        Node temp = new Node(data);
        if(head==null){
            head =temp;
        }else{
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next=temp;

        }
    }
    void addFirst(int data){
        Node temp = new Node(data);
        if(head==null){
            head =temp;
        }
        else{
            temp.next =head;
            head = temp;
        }
    }
    void add(int index, int data) throws IndexOutOfBoundsException{
        Node temp = new Node(data);
      try {
        if(head==null){
            head =temp;
         }
         else{
             Node curr =head;
             int count =0;
             while(count<index-1){
                 curr =curr.next;
                 count++;
             }
             temp.next =curr.next;
             curr.next =temp;
         }
      } catch (NullPointerException e) {
        throw new IndexOutOfBoundsException();
      }

    }
    void add(int [] arr){
        for(int i:arr){
            add(i);
        }
    }
    void remove(){
        if(head==null){

        }
        else if(head.next==null){
            head =null;
        }
        else if (head.next!=null) {
            Node curr =head;
            head = head.next;
            curr.next =null;
        }
    }
    
    void removeLast(){
        if(head==null){

        }
        else if(head.next==null){
            head =null;
        }
        else if (head.next!=null) {
            Node curr = head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
           curr.next =null;
        }
    }
    int indexOf(int data){
        Node curr = head;
        int count =0;
        while ( curr!=null){
            if(curr.data ==data){
                return count;
            }
            curr = curr.next;
            count++;
        }
        return -1;
    }
    int lastIndexOf(int data){
        Node curr = head;
        int count =0;
        int index =-1;
        while ( curr!=null){
            if(curr.data ==data){
                index =count;
            }
            curr = curr.next;
            count++;
        }
        return index;
    }
    int size(){
        Node curr = head;
        int count =0;
        while(curr!=null){
            curr =curr.next;
            count++;
        }
        return count;
    }
}
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
            ll.add(10);
            ll.add(40);
            ll.add(30);
            ll.add(40);
            ll.add(50);
           
          

            ll.printLinkedList();
            System.out.println(ll.size());
            
    }
}
