class MyHashMap {
    List<Integer> li=new ArrayList<>();

    public MyHashMap() {
        List<Integer> arr=new ArrayList<>(Collections.nCopies
        ((int)1e6+7, -1));
        li=arr;
    }
    
    public void put(int key, int value) {
        li.set(key, value);
        
    }
    
    public int get(int key) {
        int ans=li.get(key);
        return ans;
        
    }
    
    public void remove(int key) {