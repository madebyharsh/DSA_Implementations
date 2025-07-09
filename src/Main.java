//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Application Started Successfully");

        System.out.println("SinglyLinkedList implementation");
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        System.out.print("Values added in the singlyLinkedList are : ");
        for(int val = 0; val < 10; val++, val++){
            System.out.print(val+" ");
            singlyLinkedList.insert(val);
        }
        System.out.println();
        singlyLinkedList.traverse();
        System.out.println(singlyLinkedList.search(55));
        System.out.println(singlyLinkedList.search(4));

        singlyLinkedList.insertAt(99, 88);
        System.out.println();
        singlyLinkedList.traverse();
    }
}