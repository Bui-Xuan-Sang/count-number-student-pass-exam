import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng sinh viên: ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.print("Số lượng sinh viên không được vượt quá 30.");
            }
        }while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.print("Nhập điểm cho sinh viên " + (i + 1) +": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sách điểm: ");
        for ( int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.println("\n" + "Số sinh viên thi đỗ: " + count);
    }
}
