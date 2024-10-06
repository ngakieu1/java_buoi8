public class Pair<U,V> {
    private U first;
    private V second;

    public U getFirst() {
        return first;
    }

    public void setFirst(U first) {
        this.first = first;
    }
    public V getSecond() {
        return second;
    }
    public void setSecond(V second) {
        this.second = second;
    }

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        /*Pair<Integer, Integer> pair1 = new Pair(3,4);
        Pair<String, Integer> pair2 = new Pair("Tung", 22);
        Pair<String, String> pair3 = new Pair(new File("a.txt"), new File("b.txt"));
        System.out.println(pair2.getSecond());
        System.out.println(pair2.getFirst());
        Pair pair1 = new Pair(3, "String");
        Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(3,"String");
        Pair pair1 = new Pair<Integer, Integer>(3,5);
        pair1 = new Pair<String, String>("Minh","Toan");

         */
    }
}
