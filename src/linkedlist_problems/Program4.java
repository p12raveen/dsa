package linkedlist_problems;

import java.util.Scanner;

public class Program4 {
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
        int k = sc.nextInt();

        head = rightRotate(head,k);
        printList(head);
    }

    private static Node rightRotate(Node head, int k) {
        if(head==null || head.next == null || k==0)
            return head;

        Node tail = head;
        int length = 1;
        while (tail.next!=null)
        {
            length++;
            tail = tail.next;
        }

        tail.next = head;
        int temp = length-k;
        Node newTail = head;

        for (int i=1;i<temp;i++)
        {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        newTail.next = null;

        return newHead;

    }

    private static void printList(Node head) {
        Node current = head;
        while (current!=null)
        {
            System.out.print(current.data+"\t");
            current = current.next;
        }
    }


}
