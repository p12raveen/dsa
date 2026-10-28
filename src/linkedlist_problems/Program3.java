package linkedlist_problems;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for(int i=0;i<n;i++)
        {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
            }
            tail = newNode;
        }
        int p = sc.nextInt();

        head = partition(head,p);
        printList(head);
    }

    private static void printList(Node head) {
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data+"\t");
            current = current.next;
        }
    }

    private static Node partition(Node head, int p) {
        Node small = new Node(0);
        Node large = new Node(0);

        Node smallTail = small;
        Node largeTail = large;

        Node current = head;

        while (current!=null)
        {
            Node nextNode = current.next;
            current.next = null;

            if(current.data<p)
            {
                smallTail.next = current;
                smallTail = current;
            }
            else {
                largeTail.next = current;
                largeTail = current;
            }
            current = nextNode;
        }

        smallTail.next = large.next;
        if(small.next !=null)
        {
            return small.next;
        }
        return large.next;
    }
}
