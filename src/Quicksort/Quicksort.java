package Quicksort;

public class Quicksort {
    //sắp xếp nhanh
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);

            quickSort(arr, left, pivotIndex - 1);   // sắp xếp bên trái pivot
            quickSort(arr, pivotIndex + 1, right);  // sắp xếp bên phải pivot
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];   // chọn pivot là phần tử cuối
        int i = left - 1;         // chỉ số phần tử nhỏ hơn pivot

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);  // đưa pivot về đúng vị trí
        return i + 1;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

//Quicksort(sắp xếp nhanh)
//Ưu điểm của Quicksort
//1. Rất nhanh trong thực tế
//
//Trung bình đạt O(n log n)
//
//Nhanh hơn nhiều so với Bubble Sort, Selection Sort, Insertion Sort.
//
//2. Ít thao tác hoán đổi
//
//Quicksort thường swap ít hơn các thuật toán O(n²) khác → tốc độ cao.
//
//3. Áp dụng chia để trị → cài đặt đẹp
//
//        Code gọn, logic rõ ràng nhờ sử dụng đệ quy.
//
//4. Không cần dùng mảng phụ lớn
//
//Sắp xếp ngay trong mảng ban đầu (in-place), chỉ tốn thêm stack đệ quy.
//
//        5. Được dùng trong thư viện chuẩn
//
//Nhiều ngôn ngữ (Java, C++, Python) dùng biến thể của QuickSort vì hiệu năng cao.
//
//  Nhược điểm của Quicksort
//1. Trường hợp xấu nhất là O(n²)
//
//Ví dụ pivot chọn không tốt, như:
//
//Mảng đã sắp xếp tăng dần
//
//Mảng đã sắp xếp giảm dần
//
//Luôn chọn pivot = phần tử đầu hoặc cuối
//
//2. Dùng đệ quy → có thể gây tràn stack
//
//Nếu chia mảng không đều (ví dụ 1 phần tử – 99 phần tử), gọi đệ quy nhiều tầng.
//
// 3. Không ổn định
//
//Hai phần tử bằng nhau có thể bị đổi vị trí.
//
//4. Hiệu năng phụ thuộc vào cách chọn pivot
//
//Chọn pivot thông minh thì nhanh, chọn tệ thì rất chậm.