import java.util.*;

public class HashMap <K, V>{
    int bucket_Size;
    int map_Size;
    List<Node<K, V>>[] buckets;
    HashMap(){
        this.bucket_Size = 2;
        this.map_Size = 0;
        this.buckets = new LinkedList[bucket_Size];
        for(int i = 0; i < bucket_Size; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    public int hashing(K key){
        int hashValue = key.hashCode();
        int bucket_Index = Math.abs(hashValue)%bucket_Size;
        return bucket_Index;
    }

    public void rehashing(){
        System.out.println("Rehashing...");
        map_Size = 0;
        List<Node<K, V>>[] oldBuckets = buckets;
        bucket_Size *= 2;
        buckets = new LinkedList[bucket_Size];
        for(int i = 0; i < bucket_Size; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int i = 0; i < oldBuckets.length; i++){
            for(int j = 0; j < oldBuckets[i].size(); j++){
                Node node = oldBuckets[i].get(j);
                insert((K) node.key, (V) node.value);
            }
        }
    }
    public void insert(K key, V value){
        int bucket_Index = hashing(key);
        List<Node<K, V>> list = buckets[bucket_Index];
        int ind = get(key);
        if(ind!= -1){
            Node<K, V> node = list.get(ind);
            node.value = value;
        }
        else{
            Node<K, V> node = new Node(key, value);
            list.add(node);
            map_Size++;
        }
        double loadFactor = (double) map_Size / bucket_Size;
        if(loadFactor>0.5) rehashing();
    }
    public int get(K k){
        int bucket_Index = hashing(k);
        List<Node<K, V>> list = buckets[bucket_Index];
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).key.equals(k)) return i;
        }
        return -1;
    }

    public Set<K> keySets(){
        Set<K> set = new HashSet<>();
        for(int i = 0; i < bucket_Size; i++){
            for(int j = 0; j < buckets[i].size(); j++){
                set.add((K) buckets[i].get(j).key);
            }
        }
        return set;
    }
    public void printData(){
        Set<K> set = new HashSet<>();
        System.out.print("[");
        for(int i = 0; i < bucket_Size; i++){
            for(int j = 0; j < buckets[i].size(); j++){
                Node node = buckets[i].get(j);
                System.out.print(node.key +" "+node.value+"\t");
            }
        }
        System.out.println();
    }



}


class Node<K, V>{
    K key;
    V value;
    Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}
