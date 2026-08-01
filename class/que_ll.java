class QueueLinkedList {

    Node front, rear;

    QueueLinkedList() {
        front = rear = null;
    }

    // Enqueue
    void enqueue(int item) {

        Node temp = new Node(item);
        if(front == null){
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }

    // Dequeue
    int dequeue() {

        if(front == null){
            return -1;
        }
        int x = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return x;
    }

    // Display
    void display() {

        if(front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}