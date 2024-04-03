import java.util.Scanner;

public class danhgianangluc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("điểm chuyên cần: ");
        double diemChuyenCan = scanner.nextDouble();
        System.out.print("điểm kiểm tra thường xuyên: ");
        double diemKiemTrathuongxuyen = scanner.nextDouble();
        System.out.print("điểm thi học kỳ: ");
        double thihocky = scanner.nextDouble();
        double diemTrungBinh = (diemChuyenCan + diemKiemTrathuongxuyen + thihocky) / 3;
        String Loai;
        if (diemTrungBinh >= 8.5) {
            Loai = "A";
        } else if (diemTrungBinh >= 7) {
            Loai = "B";
        } else if (diemTrungBinh >= 5.5) {
            Loai = "C";
        } else if (diemTrungBinh >= 4) {
            Loai = "D";
        } else {
            Loai = "F";
        }

        System.out.println("Xếp loại: " + Loai);

        scanner.close();
    }
}
