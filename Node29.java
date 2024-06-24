public class Node29 {
    int data;
    int jarak;
    Node29 prev, next;

    Node29(Node29 prev, int data, int jarak, Node29 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
