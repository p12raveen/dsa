package linkedlist_problems;

import java.util.Scanner;

public class Program1 {


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head=null;
        Node tail=null;
        for(int i=0;i<n;i++)
        {
            Node node = new Node(sc.nextInt());
            if(head==null)
            {
                head = node;
            }
            else {
                tail.next = node;
            }
            tail = node;
        }

        int k = sc.nextInt();
        if(k<=0)
        {
            System.out.println("Invalid K");
            return;
        }

        head = reverseGroup(head,k);

        while(head!=null)
        {
            System.out.print(head.data);
            if(head.next!=null)
            {
                System.out.print(" ");
            }
            head = head.next;
        }
    }

    private static Node reverseGroup(Node head, int k) {
        Node current = head;
        int count = 0;
        while(current!=null && count<k)
        {
            current = current.next;
            count++;
        }
        if(count<k)
            return head;

        current = head;
        Node prev = null;

        for(int i=0;i<k;i++)
        {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head.next = reverseGroup(current,k);
        return prev;
    }
}
