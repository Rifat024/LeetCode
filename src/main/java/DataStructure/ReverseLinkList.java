package DataStructure;

public class ReverseLinkList {
    Node head;
    private int size;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
            size++;
        }
    }

    //add first and last
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void deleteFirst(){
        if (head==null){
            System.out.println("List is empty");
        }
        size--;
        head =head.next;
    }

    public void deleteLast(){
        if (head==null){
            System.out.println("List is empty");
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while (last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;
    }


    public void printList() {
        if (head == null) {
            System.out.println("List Is empty");
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value+"-->");
            current = current.next;
        }
        System.out.print("NULL"+"\tand size is ="+size+"\n");
    }

    private void reverseList(){
        if (head==null || head.next==null){
            return;
        }
        Node previousNode=head;
        Node currentNode=head.next;
        while (currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next=previousNode;

            previousNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=previousNode;
    }

    public static void main(String[] args) {

        ReverseLinkList list = new ReverseLinkList();
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(15);
        list.printList();
        list.reverseList();
        list.printList();
    }
}
