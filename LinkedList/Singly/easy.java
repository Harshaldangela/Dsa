package LinkedList.Singly;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class easy {
    public static void dele(Node node){
        if(node==null || node.next==null){
            System.out.println("Cannot Delete");
            return;
        }
        node.data=node.next.data;
        node.next=node.next.next;
    }
    public static Node ins(Node head,int x){
        if(head==null) return new Node(x);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new Node(x);
        return head;
    }
    public static void printList(Node head){
        Node cur=head;
        while (cur!=null) {
            System.out.print(cur.data + "-->");
            cur=cur.next;
        }
        System.out.println("null");
    }

    public static int getCount(Node head){
        int count=0;
        Node cur=head;
        while (cur!=null) {
            cur=cur.next;
            count++;
        }return count;
    }

    public static boolean search(Node head,int key){
        Node cur=head;
        while(cur!=null){
            if(cur.data==key) return true;
            cur=cur.next;
        }return false;
    }
    public static void main(String[] args) {
        Node head=null;
        head=ins(head, 10);
        head=ins(head, 20);
        head=ins(head, 110);
        System.out.println(search(head, 22));
        Node cur=head;
        while(cur!=null && cur.data!=50){
            cur=cur.next;
        }
        if(cur!=null && cur.next!=null){
            dele(cur);
        }else{
            System.out.println("Node not present");
        }
        printList(head);
        System.out.println(getCount(head));
    }
}
