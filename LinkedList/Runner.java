package LinkedList;
public class Runner {

    //Linked List: 5 -> 3 -> 12 -> 4 -> 8

    public static void main(String args[]){
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(3);
        list.insert(12);
        list.insert(4);
        list.insertAtStart(10);
        list.insertAt(0,8);
        list.show();
        list.deleteAt(0);
        list.show();
    }


}
