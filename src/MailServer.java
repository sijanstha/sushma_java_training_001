public class MailServer {

    public void send() {
        System.out.println("Sending Email");
        connect();
        authenticate();
        System.out.println("Email Sent");
        disconnect();
    }

    private void connect() {
        System.out.println("Connection to sever");
    }

    private void authenticate() {
        System.out.println("User Authentication");
    }

    private void disconnect() {
        System.out.println("Disconnecting from server");
    }

}
