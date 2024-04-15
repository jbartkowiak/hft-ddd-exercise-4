
public class Book {
    private String id;
    private String title;
    private Money price;

    public Book(String id, String title, Money price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Money getPrice() {
        return price;
    }
}
