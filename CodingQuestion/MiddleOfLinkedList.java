package CodingQuestion;
class  Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;
    void printMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // 1 step
            fast = fast.next.next;   // 2 steps
        }

        System.out.println("Middle element is: " + slow.data);
    }
    void push(int new_data)
    {    Node newNode= new Node(new_data);  // 10 , null  head= null true head=new node temp =new node
        if(head==null)
        {
            head=newNode;
            System.out.println(head.hashCode());
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next = newNode;
    }
}
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        System.out.println(obj.head);
        obj.push(1);
       /* obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);*/
       obj.printMiddle();
       int s=10;
       if(s<25)
           System.out.println("this is 25");
       else if(s<56)
           System.out.println("this is 45");
       else if (s<32)
           System.out.println("thi is 32");
       else
           System.out.println("thi is else part");
    }
}
