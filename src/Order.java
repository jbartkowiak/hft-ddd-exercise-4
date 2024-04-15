
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private Customer customer;
    private List<Book> books = new ArrayList<>();
    private Money totalPrice;

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.totalPrice = new Money(0, "USD");
    }

    public void addBook(Book book) {
        books.add(book);
        totalPrice = new Money(totalPrice.getAmount() + book.getPrice().getAmount(), "USD");
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Money getTotalPrice() {
        return totalPrice;
    }
}
