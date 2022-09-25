class MyCircularQueue {
    private LinkedList<Integer> q;
    private int k;

    public MyCircularQueue(int k) {
        this.k = k;
        q = new LinkedList<>();
    }
    
    public boolean enQueue(int value) {
        if(q.size() == k) return false;
        q.add(value);
        return true;
    }
    
    public boolean deQueue() {
        if(q.size() == 0) return false;
        q.removeFirst();
        return true;
    }
    
    public int Front() {
        if(q.size() == 0) return -1;
        return q.getFirst();
    }
    
    public int Rear() {
        if(q.size() == 0) return -1;
        return q.getLast();
    }
    
    public boolean isEmpty() {
        return q.size() == 0;
    }
    
    public boolean isFull() {
        return q.size() == k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */