package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    //sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2,1,4,5,6,3,7,9,8,10 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
//Bubble Sort (Sắp xếp nổi bọt)
//Ưu điểm:
//1. ĐƠN GIẢN để hiểu và code
//for (int i = 0; i < n-1; i++) {
//    for (int j = 0; j < n-1-i; j++) {
//        if (arr[j] > arr[j+1]) {  // So sánh cặp liền kề
//            // Swap
//            int temp = arr[j];
//            arr[j] = arr[j+1];
//            arr[j+1] = temp;
//        }
//    }
//}
//
// 2. Sắp xếp TẠI CHỖ (in-place)
// Không cần thêm bộ nhớ
//
// 3. Ổn định (stable)
//Giữ nguyên thứ tự các phần tử bằng nhau

//Nhược điểm:
//CHẬM NHẤT: O(n²) trong hầu hết trường hợp
//
//Không thực tế với mảng lớn
//
//Chỉ dùng để học, không dùng production