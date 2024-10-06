public class MyList2 <T> {
    T[] arr;
    int index = 0;
    MyList2(int num){
        arr = (T[]) new Object[num];
    }
    void add(T x){
        arr[index] = x;
        index++;
    }
    T get(int index){ //them vao
        return arr[index];
    }
    void display(){
        for (int i = 0; i<index; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        /*MyList2<Integer> list = new MyList(8);
        list.add(4);
        list.add(5);
        list.add(4.6);
        list.add("KTQD");
        list.display();

         */


        MyList2<Integer> listNumber = new MyList2(8);
        listNumber.add(3);
        listNumber.add(5);
        int x = listNumber.get(0); //3
        System.out.println(x/2);
        MyList2<String> listString = new MyList2(8);
        listString.add("Minh");
        listString.add("Giang");
        String name = listString.get(1);//Giang
        System.out.println(name);


    }

}