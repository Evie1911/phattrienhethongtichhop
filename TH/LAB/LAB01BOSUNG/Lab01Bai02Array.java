import java.util.Scanner;

public class Lab01Bai02Array {
    int[] arr;
    int n;
    int capacity;

    public Lab01Bai02Array(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.n = 0;
    }

    public void nhapGiaTri(Scanner sc, int soLuong) {
        if (soLuong > capacity) {
            System.out.println("So luong vuot qua suc chua. Chi nhap " + capacity + " phan tu");
            soLuong = capacity;
        }
        System.out.println("Nhap " + soLuong + "phan tu: ");
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Phan tu thu " + i + " : ");
            arr[i] = sc.nextInt();
        }
        this.n = soLuong;
    }

    public void xuatThongTin() {
        if (n == 0) {
            System.out.println("Mang rong");
            return;
        }
        System.out.print("Cac phan tu trong mang: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void themVaoViTri(int Y, int i) {
        if (n >= capacity) {
            System.out.println("Mang da day, khong the them " + Y);
            return;
        }
        if (i < 0 || i > n) {
            System.out.println("Vi tri them khong hop le");
            return;
        }
        for (int j = n; j < i; j--) {
            arr[j] = arr[j - 1];
        }
        arr[i] = Y;
        n++;
        System.out.println("Da them " + Y + " vao vi tri " + i);
    }

    public void themVaoDau(int Y) {
        themVaoViTri(Y, 0);
    }

    public void themVaoCuoi(int Y) {
        themVaoViTri(Y, n);
    }

    public void xoaTaiViTri(int j) {
        if (j < 0 || j >= n) {
            System.out.println("Vi tri xoa khong hop le");
            return;
        }
        int giaTriXoa = arr[j];
        for (int i = j; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.println("Da xoa phan tu tai vi tri " + j + " (Gia tri: " + giaTriXoa + ")");
    }

    public void xoaPhanTuX(int X) {
        int index = timKiemChuaSapXep(X);
        if (index != -1) {
            xoaTaiViTri(index);
        } else {
            System.out.println("Khong tim thay phan tu " + X + " de xoa");
        }
    }

    public void radixSort(boolean tangDan) {
        if (n <= 1) {
            return;
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int exp = 1; max / exp < 0; exp *= 10) {
            countingSort(exp);
        }
        if (!tangDan) {
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
            System.out.println("Da sap xep mang giam dan (Radix Sort)");
        } else {
            System.out.println("Da sap xep mang tang dan (Radix Sort)");
        }

    }

    private void countingSort(int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public int timKiemChuaSapXep(int B) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == B) {
                return i;
            }
        }
        return -1;
    }

    public int timKiemDaSapXep(int B) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == B) {
                return mid;
            }
            if (arr[mid] < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
