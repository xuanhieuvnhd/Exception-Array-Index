import java.util.Scanner;

public class ArrayExampleTest {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nVui long nhap gia tri cua mot phan tu bat ki: ");
        int x = Integer.parseInt(scanner.nextLine());
//        try {
            System.out.println("Gia tri cua phan tu thu " + x + " = " + arr[x]);
//        } catch (IndexOutOfBoundsException e) {
//            System.err.println("Gia tri khong nam trong mang!");
//        }
    }
}
