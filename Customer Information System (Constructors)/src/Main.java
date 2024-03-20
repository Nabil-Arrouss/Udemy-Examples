public class Main {
    public static void main(String[] args) {
        // Customer with name, credit limit, and email address
        Customer c1 = new Customer("Nabil Arrouss", 5000.00, "email@email.com");
        System.out.println("Name: " + c1.getName() + ", Credit Limit: " + c1.getCreditLimit() + ", Email: " + c1.getEmailAddress());

        // Customer with name and email address (default credit limit)
        Customer c2 = new Customer("Soufiane", "email@email.com");
        System.out.println("Name: " + c2.getName() + ", Credit Limit: " + c2.getCreditLimit() + ", Email: " + c2.getEmailAddress());

        // Customer with default values
        Customer c3 = new Customer();
        System.out.println("Name: " + c3.getName() + ", Credit Limit: " + c3.getCreditLimit() + ", Email: " + c3.getEmailAddress());
    }
}
