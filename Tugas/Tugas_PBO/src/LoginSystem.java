import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan anda: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // membersihkan newline character

        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin226") && password.equals("Password226")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Nama Mahasiswa: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String password = scanner.nextLine();

            // Ganti dengan logika validasi Nama dan NIM mahasiswa
            if (nim.equals("Chraitong Pranadipa Mardjun") && password.equals("202410370110226")) {
                System.out.println("Login Mahasiswa berhasil!");  // Pesan keberhasilan
            } else {
                System.out.println("NIM atau password salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}