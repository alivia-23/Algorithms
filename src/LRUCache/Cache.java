package LRUCache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private final int capacity; // Maximum capacity of the cache
    private int size; // current size of the cache
    private final Map<Integer, DLLNode> cacheMap; // hashmap to store the key and node pairs for O(1) access
    private final DLLNode head;  // dummy head of the doubly linkedlist
    private final DLLNode tail;  // dummy tail of the doubly linkedlist
    // Constructor to initialize the cache
    public Cache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.cacheMap = new HashMap<>();
        head = new DLLNode(0, 0);
        tail = new DLLNode(0, 0);
        // make sure the head and tail are linked to each other
        head.next = tail;
        tail.prev = head;
    }
    // Retrieve the value of the node associated with the given key
    public int get(int key) {
        DLLNode foundNode = null;
        if (cacheMap.containsKey(key)) {
            foundNode = cacheMap.get(key);
            moveToHead(foundNode); // move the recently accessed node next to the head node to maintain the LRU order
        } else {
            return -1;
        }

        return foundNode.value;
    }

    // Moves the recently accessed node next to the head node of the doubly linked list
    public void moveToHead(DLLNode node) {
        deleteNode(node);
        addToHead(node);
    }
    // Removes a node from the doubly linkedlist
    public void deleteNode(DLLNode node) {
        node.prev.next = node.next; // my node's previous node's next pointer should point to my node's next node (i.e.my previous node will point to my next node)
        node.next.prev = node.prev;  // my node's next node should point to my previous node (i.e. my next node should point to my previous node)
    }
    // Adds a node right after the dummy head node
    public void addToHead(DLLNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;

    }
    // Removes and returns from tail node (Least Recently used node)
    public DLLNode remmoveFromTail() {
        DLLNode lruNode = tail.prev;
        deleteNode(lruNode);
        return lruNode;
    }
}
