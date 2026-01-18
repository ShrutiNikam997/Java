import java.util.*;

class StackArr {
    int top;
    int size;
    int[] Arr;

    Stack(int size) {
        this.size = size;
        Arr = new int[size];
        top = -1;
    }

    void Push(int x) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
            return;

        }
        Arr[++top] = x;
    }

    void Pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped :" + Arr[top--]);

    }

    void Peek() {
        if (top == -1) {
            System.out.println("stack is empty");
            return;

        }
        System.out.println("Element at top is :" + Arr[top]);
    }

    void Display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(Arr[i] + " ");
        }
    }
}

public class StackArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter stack size :");
        int size = sc.nextInt();

        Stack obj = new Stack(size);

        while (true) {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("0.Exit");

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("enter value to push");
                    int val = sc.nextInt();
                    obj.Push(val);
                    break;

                case 2:
                    obj.Pop();
                    break;

                case 3:
                    obj.Peek();
                    break;

                case 4:
                    obj.Display();

                case 0:
                    System.out.println("Exiting...........");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice :");

            }

        }

    }
}