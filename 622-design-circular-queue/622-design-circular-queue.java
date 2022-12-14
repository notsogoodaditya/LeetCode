class MyCircularQueue {
    List<Integer> list = new ArrayList<>();
    int k;
    public MyCircularQueue(int k) {
        this.k = k;
    }
    
    public boolean enQueue(int value) {
        if(list.size()<k){
            list.add(value);
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(list.isEmpty()){
            return false;
        }
        list.remove(0);
        return true;
    }
    
    public int Front() {
        if(list.isEmpty()){
            return -1;
        }
        return list.get(0);
    }
    
    public int Rear() {
        if(list.isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public boolean isFull() {
        return list.size()==k;
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