import java.util.*;

class QueueArr {

    int size;
    int Arr[];
    int front;
    int rear;

    QueueArr(int size) {
        this.size = size;
        Arr = new int[size];
        front = 0;
        rear = -1;

    }

    void Enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is overflow");
            return;
        }
        Arr[++rear] = x;
        System.out.println("Enqueued :" + x);

    }

    void Dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued :" + Arr[front++]);
    }

    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Element at top is:" + Arr[front]);
    }

    void Display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(Arr[i] + " ");
        }
    }

}

public class QueueArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int Arr[] = new int[n];

        QueueArr obj = new QueueArr(n);

        while (true) {
            System.out.println("1.Enqueue.");
            System.out.println("2. Dequeue");
            System.out.println("3. top");
            System.out.println("4.Display");
            System.out.println("0.Exit");

            System.out.println("Enter the choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element");
                    int val = sc.nextInt();
                    obj.Enqueue(val);
                    break;

                case 2:
                    obj.Dequeue();
                    break;

                case 3:
                    obj.peek();
                    break;

                case 4:
                    obj.Display();
                    break;

                case 0:
                    System.out.println("Exiting........");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");

            }

        }
    }
}