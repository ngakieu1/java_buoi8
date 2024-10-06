public class Main {
            public static void main(String[] args) {
                Double[] doubles = {1.2, 3.5, 2.5, 3.0, 6.0, 2.2};
                Integer[] integers = {1, 0, -4, 3, 2, 3, 4, -1, 6, 2, 4};
                String[] names = {"Minh", "Thu", "Tuấn Anh"};
//        System.out.println(getMiddle(doubles));
//        System.out.println(getMiddle(integers));
//        System.out.println(getMiddle(names));
                System.out.println(sum(doubles));
                System.out.println(sum(integers));
                //System.out.println(sum(names));
            }

            static int sum(Integer[] arr) {
                int tong = 0;
                for (int i = 0; i < arr.length; i++) {
                    tong = tong + arr[i];
                }
                return tong;
            }

            static <T extends Number> double sum(T[] arr){
                double tong;
                tong = 0;
                for (int i =0; i<arr.length; i++){
            tong = tong + arr[i].doubleValue();
        }
        return tong;

    }
}


