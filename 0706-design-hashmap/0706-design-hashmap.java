class Node{
    int key, val;
    Node next;
    public Node(int key, int value, Node next){
        this.key = key;
        this.val = value;
        this.next = next;
    }
}

class MyHashMap {
    static final int size = 19997;
    static final int mult = 12582917;
    Node[] data;
    public MyHashMap() {
        this.data = new Node[size];
    }
    private int hash(int key){
        return (int)((long)key * mult % size);
    }
    public void put(int key, int val) {
        remove(key);
        int h = hash(key);
        Node n = new Node(key, val, data[h]);
        data[h] = n;
    }
    public int get(int key) {
        int h = hash(key);
        Node n = data[h];
        for(; n != null; n = n.next){
            if(n.key == key)return n.val;
        }
        return -1;
    }
    public void remove(int key) {
        int h = hash(key);
        Node n = data[h];
        if(n == null)return;
        if(n.key == key)data[h] = n.next;
        else for(; n.next != null; n=n.next){
            if(n.next.key == key){
                n.next = n.next.next;
                return;
            }
        }

    }
}