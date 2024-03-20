public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // Constructors
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Parameters passed directly to the fields. This constructor assigns the arguments directly to the fields.");
    }

    public Customer(String name, String emailAddress) {
        this(name, 6000.00, emailAddress);
    }

    public Customer() {
        this("Nabil", "email@email.com");
        System.out.println("No arguments passed to this constructor. Using default values.");
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
