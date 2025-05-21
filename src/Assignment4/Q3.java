package Assignment4;

class Node{
    char data;
    Node next;
    Node(char data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList {
    Node head;

    public void append(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("Null");
    }
}
class ListConcatenation{
    public static void concatenation(LinkedList list1,LinkedList list2){
        if(list1.head==null){
            list1.head=list2.head;
            return;
        }else{
            Node current=list1.head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=list2.head;
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        list1.append('a');
        list1.append('b');
        list1.append('c');
        list1.display();

        LinkedList list2=new LinkedList();
        list2.append('d');
        list2.append('e');
        list2.append('f');
        list2.display();

        ListConcatenation.concatenation(list1,list2);
        list1.display();
    }
}
