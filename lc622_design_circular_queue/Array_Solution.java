class MyCircularQueue {
    
    private int[] q;
    private int front;
    private int rare;
    private int k;

    public MyCircularQueue(int k) {
        this.k = k;
        q = new int[k];
        front = 0;
        rare = 0;
        Arrays.fill(q, -1);
    }
    
    public boolean enQueue(int value) {
        if(q[rare] == -1) {
            q[rare] = value;
            rare++;
            rare %= k;
            return true;
        } else return false;
    }
    
    public boolean deQueue() {
        if(q[front] == -1) return false;
        else {
            q[front] = -1;
            front = (front+1) % k;
            return true;
        }
    }
    
    public int Front() {
        return q[front];
    }
    
    public int Rear() {
        return q[(rare+k-1)%k];
    }
    
    public boolean isEmpty() {
        return q[front] == -1;
    }
    
    public boolean isFull() {
        return front == rare && q[front] != -1;
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