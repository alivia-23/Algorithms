package LRUCache;

public class DLLNode {
    public int key;
    public int value;
    DLLNode prev;
    DLLNode next;
    public DLLNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }

}
