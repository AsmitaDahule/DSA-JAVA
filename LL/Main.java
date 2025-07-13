

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


public void nthposition(int value, int index){
    if(index == 0){
        insertFirst(value);
    } 
    if(index == size){
        insertLast(value);
    } 

    Node temp = head;
    for(int i = 1; i < index; i++){
        temp = temp.next;
    }
    Node node = new Node(value);

    node.next = temp.next;
    temp.next = node;


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

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
}

public class Main{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.display();

        list.insertLast(9);

        list.display();

        list.nthposition(99, 3);
        list.display();
        list.deleteFirst();
        list.display();
    }
}