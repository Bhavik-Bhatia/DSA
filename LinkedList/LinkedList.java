package LinkedList;

//Creating a LinkedList Class for practical implementation

public class LinkedList {
    Node head;

        /*
        Now we have data and the node is created but
        where should that node be positioned,
        if first node : head
        if not check for last node
        */

    public void insert(int data){
        Node node = new Node(data);
        if (head==null){
            head=node;
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public void deleteAt(int index){
        int count=0;
        Node temp = head;

        if (index==0){
            head=head.next;
        }else {
            while (count!=index-1){
                if (temp.next!=null){
                    temp=temp.next;
                    count=count+1;
                }else throw new IndexOutOfBoundsException();
            }
            Node prevNode=temp.next;
            temp.next=prevNode.next;

        }
    }

    public void insertAt(int index,int data){
        Node node = new Node(data);
        int count=0;
        Node temp = head;

        if(index==0){
            insertAtStart(data);
            return;
        }
        while (count!=index-1){
            if (temp.next!=null){
                temp=temp.next;
                count=count+1;
            }else throw new IndexOutOfBoundsException();
        }
        node.next=temp.next;
        temp.next=node;

    }
}
