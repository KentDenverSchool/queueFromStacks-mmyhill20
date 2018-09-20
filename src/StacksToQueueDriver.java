/*
* StacksToQueueDriver
* Purpose: The goal of StacksToQueueDriver is
* Author/s: Morgan Myhill
* 9/20/18
* On My Honor: MM
* Collaborators:
*/
public class StacksToQueueDriver {
    public static void main(String[] args) {
        StacksToQueue use = new StacksToQueue();
        System.out.println(use.isEmpty());
        System.out.println(use.size());
        System.out.println();

        use.enqueue(1);
        use.enqueue(2);
        use.enqueue(3);

        System.out.println(use.size());
        System.out.println(use.isEmpty());
        System.out.println();

        use.enqueue(4);
        use.enqueue(5);

        System.out.println(use.dequeue());
        System.out.println(use.dequeue());
        System.out.println(use.dequeue());
        System.out.println(use.dequeue());
        System.out.println(use.dequeue());

        System.out.println(use.isEmpty());
    }
}
