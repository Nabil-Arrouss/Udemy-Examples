package ChatApp;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(User receiver, String message) {
        // Null check for receiver
        if (receiver == null) {
            System.out.println("Error: Receiver is null.");
            return;
        }
        
        // Null or empty message check
        if (message == null || message.isEmpty()) {
            System.out.println("Error: Message is null or empty.");
            return;
        }

        System.out.println(this.name + " 'SENT' to " + receiver.getName() + ": " + message);
        
        // Assuming receiver can handle receiving messages even if they are not available
        receiver.receiveMessage(this, message);
    }

    private void receiveMessage(User sender, String message) {
        // Null or empty message check
        if (message == null || message.isEmpty()) {
            System.out.println("Error: Message is null or empty.");
            return;
        }
        
        // Displaying the received message
        System.out.println(this.name + " 'RECEIVED' from " + sender.getName() + ": " + message);
    }
}
