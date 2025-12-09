package BinarySearch;

public class BinarySearch {
//tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; //tìm ở giữa

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;  //tìm bên phải
            }
            else  {
                right = mid - 1; //tìm bên trái
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        //phải sắp xếp tăng dần không thì thuật toán sẽ sai
        int[] arr = {1,2,3,5,6,7,8,9,10};
        int target = 9;

        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}
//Binary Search (Tìm kiếm nhị phân)
//Ưu điểm:
//1. NHANH NHẤT: O(log n)
//while (left <= right) {           // Sau mỗi bước, giảm 1 nửa
//    int mid = (left + right) / 2; // Chia đôi mảng
//
//    if (arr[mid] == target) return mid;
//    if (arr[mid] < target) left = mid + 1;   // Chỉ tìm nửa phải
//    else right = mid - 1;                    // Chỉ tìm nửa trái
//}
//
// 2. Hiệu quả với mảng LỚN
// Mảng 1 triệu phần tử chỉ cần ~20 bước
// (vì 2^20 ≈ 1,000,000)
//
//Nhược điểm:
//Yêu cầu mảng SẮP XẾP trước
//
//Code phức tạp hơn linear search
//
//Chỉ tìm được 1 vị trí (không phải tất cả)
