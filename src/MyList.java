public class MyList {
    Object[] arr;
    int index = 0;
    MyList(int num){
        arr = new Object[num];
    }
    void add(Object x){
        arr[index] = x;
        index++;
    }
    Object get(int index){ //them vao
        return arr[index];
    }
    void display(){
        for (int i = 0; i<index; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        /*MyList list = new MyList(8);
        list.add(4);
        list.add(5);
        list.add(4.6);
        list.add("KTQD");
        list.display();
         */

        MyList listNumber = new MyList(8);
        listNumber.add(3);
        listNumber.add(5);
        int x = (int)listNumber.get(0); //3
        System.out.println(x/2);
        MyList listString = new MyList(8);
        listString.add("Minh");
        listString.add("Giang");
        String name = (String)listString.get(1);//Giang
        System.out.println(name);
    }

}
