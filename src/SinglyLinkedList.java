public class SinglyLinkedList<T> {
    Node head;
    public void insert(T val){
        Node newNode = new Node(val, null);
        if(head==null){
            head = newNode;
        } else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAt(T val, int ind){
        Node newNode = new Node(val, null);
        Node dummy = head;
        while(dummy.next!=null && ind>=0){
            dummy = dummy.next;
            ind--;
        }
        if(dummy.next == null) dummy.next = newNode;
        else{
            newNode.next = dummy.next;
            dummy.next = newNode;
        }
    }

    public void traverse(){
        Node dummy = head;
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy = dummy.next;
        }
    }

    public boolean search(T dest){
        Node dummy = head;
        while(dummy!=null){
            if(dummy.val == dest) return true;
            dummy = dummy.next;
        }
        return false;
    }

}

class Node<T>{
    T val;
    Node next;
    Node(T val, Node next){
        this.val = val;
        this.next = next;
    }
}
