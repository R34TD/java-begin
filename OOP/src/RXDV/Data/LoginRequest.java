package RXDV.Data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("membuat object LoginRequest");

    }
    public LoginRequest(String username) {
        this(username, "");

    }
    public LoginRequest() {
        this("", "");
    }
}
