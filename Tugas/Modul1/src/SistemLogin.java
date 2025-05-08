import java.util.Scanner;

public class SistemLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // Membersihkan newline

        // Proses pilihan
        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan Username: ");
            String username = input.nextLine();
            System.out.print("Masukkan Password: ");
            String password = input.nextLine();

            if (username.equals("Admin226") && password.equals("Password226")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }

        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            if (nama.equals("Chraitong") && nim.equals("202410370110226")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}