package LinearSearch;

public class LinearSearch {
//tim kiếm tuyến tính
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,9,5,6,7,8,10};
        int target = 9;

        int result = linearSearch(arr, target);
        System.out.println(result);
    }
}

//1. Linear Search (Tìm kiếm tuyến tính)
//Ưu điểm:
//java
//1. ĐƠN GIẢN NHẤT - chỉ 1 vòng for
//for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == target) return i;
//}
//
// 2. KHÔNG CẦN mảng sắp xếp
// Làm việc với mảng BẤT KỲ thứ tự nào
//
// 3. Tìm được phần tử ĐẦU TIÊN
// Trả về ngay khi tìm thấy
//
// 4. Dễ debug, dễ hiểu
//Nhược điểm:
//Chậm nhất: O(n) - phải duyệt hết mảng trong trường hợp xấu nhất
//
//Không hiệu quả với mảng lớn