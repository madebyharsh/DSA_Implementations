
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.insert("Harsh", 9820);
        map.insert("Piyush", 0);
        map.insert("Zane", 305);
        map.insert("Noel", 4774);
        map.insert("Jessica", 7720);
        map.printData();
        System.out.println(map.keySets());
    }
}