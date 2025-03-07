import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        // Membuat instance Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mengambil input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.nextLine().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menghitung umur
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin
        String jenisKelaminOutput;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminOutput = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminOutput = "Perempuan";
        } else {
            jenisKelaminOutput = "Tidak Valid";
        }

        // Menampilkan data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminOutput);
        System.out.println("Umur       : " + umur + " tahun");

        // Menutup Scanner
        scanner.close();
    }
}