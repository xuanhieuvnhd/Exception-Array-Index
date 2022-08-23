import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[20];
        System.out.println("Danh sach cac phan tu cua mang: " );
        for (int i = 0; i < 20; i++) {
            arr[i] = rd.nextInt(20);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
