}
        tail.prev = head;
        head.next = tail;
        tail = new Node(0, 0);
        head = new Node(0, 0);
        cap = capacity;
    public LRUCache(int capacity) {


    private void addNode(Node newNode) {
        Node temp = head.next;
        head.next = newNode;
        newNode.prev = head;
        newNode.next = temp;
        temp.prev = newNode;
    }

    private void deleteNode(Node del) {
        del.prev.next = del.next;
        del.next.prev = del.prev;
    }