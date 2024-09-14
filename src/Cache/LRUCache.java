package Cache;

import javax.swing.plaf.PanelUI;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private  int capacity;
    private LinkedHashMap<Integer,Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer,Integer>(capacity,0.75F,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
                return size() > capacity;
            }
        };

    }
    public int get(Integer key){
       return cache.getOrDefault(key,-1);
    }
    public void put(Integer key,Integer val){
         cache.put(key, val);
    }
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);

        System.out.println(lruCache.cache);
        lruCache.put(3,3);
        System.out.println(lruCache.cache);


    }
}
