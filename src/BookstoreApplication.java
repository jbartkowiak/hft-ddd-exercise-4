
public class BookstoreApplication {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1", "Domain-Driven Design", new Money(29.99, "USD"));
        Book book2 = new Book("2", "Clean Code", new Money(32.50, "USD"));

        // Create customer
        Customer customer = new Customer("1", "John Doe", new Address("1234 Main St", "Anytown", "12345", "USA"));

        // Create order and add books
        Order order = new Order("1", customer);
        order.addBook(book1);
        order.addBook(book2);

        // Print order details
        System.out.println("Order ID: " + order.getId() + " for customer: " + order.getCustomer().getName());
        System.out.println("Total Order Price: $" + order.getTotalPrice().getAmount());
    }
}
