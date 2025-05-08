public class Mahasiswa extends User {
    // Constructor menggunakan super
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override login
    @Override
    public boolean login(String inputNama, String inputNim) {
        return getNama().equals(inputNama) && getNim().equals(inputNim);
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        super.displayInfo(); // tampilkan nama & NIM dari superclass
    }
}