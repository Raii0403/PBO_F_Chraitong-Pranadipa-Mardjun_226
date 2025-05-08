public class Admin {
    private final String username = "Admin226";
    private final String password = "Password226";

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}