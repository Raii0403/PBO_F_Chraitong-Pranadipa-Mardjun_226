import java.util.Scanner;

class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public boolean login(String input1, String input2) {
        return false;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

class Admin extends User {
    private String username;
    private String password;

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    public Admin(String username, String password){
        this(null,null, username, password);
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login berhasil sebagai Admin!");
        System.out.println("Username: " + username);
    }
}

class Mahasiswa extends User {

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login berhasil sebagai Mahasiswa!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi akun
        Admin admin = new Admin("Admin226", "Password226");
        Mahasiswa mahasiswa = new Mahasiswa("Chraitong", "202410370110226");

        System.out.println("Pilih Menu Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String inputUsername = input.nextLine();
            System.out.print("Masukkan Password: ");
            String inputPassword = input.nextLine();

            if (admin.login(inputUsername, inputPassword)) {
                admin.displayInfo();
            } else {
                System.out.println("Login gagal! Username atau Password salah.");
            }

        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String inputNama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String inputNim = input.nextLine();

            if (mahasiswa.login(inputNama, inputNim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Input tidak valid. Silakan pilih 1 atau 2.");
        }
    }
}