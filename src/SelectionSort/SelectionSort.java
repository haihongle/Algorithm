package SelectionSort;

import java.util.Arrays;
//sắp xếp chọn
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.println("Vòng " + (i+1) + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr1));
        selectionSort(arr1);
        System.out.println("Mảng sau sort: " + Arrays.toString(arr1));
    }
}
//Selection Sort (sắp xếp chọn)
//Ưu điểm:
//
//Đơn giản, dễ hiểu
//
//Ít lần đổi chỗ hơn Bubble Sort (chỉ n lần)
//
//Tốt khi việc đổi chỗ tốn kém (ví dụ: đổi chỗ file lớn)
//
// Nhược điểm:
//
//Vẫn chậm O(n²)
//
//Không nhận biết được mảng đã sắp xếp
//
//Không dùng trong thực tế (giống Bubble Sort)