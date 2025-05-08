public class Admin extends User {
    private final String username = "Admin226";
    private final String password = "Password226";

    // Constructor menggunakan super
    public Admin(String nama, String nim) {
        super(nama, nim);
    }

    // Override login
    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
    }
}