

class Node {
    int value;
    Node next;


    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LL {
    int size = 0;
    Node head=null;
    Node tail=null;

    public void insertFirst(int value){
      
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            head = node;
            tail = node;
        }
        else{
        tail.next = node;
        tail = node;
    }
    size += 1;
}

    public void display(){
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        while(temp != null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println(size);

    }
}

public class Main{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(45);
        list.insertFirst(55);
        list.insertFirst(35);

        list.display();

        list.insertLast(9);

        list.display();
       
    }
}