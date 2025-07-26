package LinkedList.Singly;


class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class medium {
    public static boolean hasCycle(Node head){
        Node s=head;
        Node f=head;
        while (f!=null && f.next!=null) {
            s=s.next;
            f=f.next.next;
            if(s==f) return true;
        }
        return false;
    }

    public static Node reverse(Node head){
        Node prev=null,cur=head,temp=null;
        while(cur!=null){
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

    public static Node middle(Node head){
        Node s=head,f=head;
        while (f!=null && f.next!=null) {
            s=s.next;
            f=f.next.next;
        }return s;
    }

    public static Node insert(Node head,int x){
        if(head==null) return new Node(x);
        Node cur=head;
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=new Node(x);
        return head;
    }
    public static void printLL(Node head){
        Node cur=head;
        while (cur!=null) {
            System.out.print(cur.data+" -->");
            cur=cur.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Node head=null;
        head=insert(head, 10);
        head=insert(head, 20);
        head=insert(head, 30);
        head=insert(head, 40);
        printLL(head);
        printLL(middle(head));
        printLL(reverse(head));
    }
}
