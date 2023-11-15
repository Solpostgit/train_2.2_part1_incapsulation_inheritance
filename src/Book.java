import java.util.Objects;

public class Book {
    private String name;
    private String authorName;
    private int pageQuantity;
    private String content;
    public void printContent() {
        System.out.println(content);
    }
    public void taleSay() {
        System.out.println(toString());
    }

    public Book (String name, String authorName, int pageQuantity, String content) {
        this.name = name;
        this.authorName = authorName;
        this.pageQuantity = pageQuantity;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return pageQuantity == book.pageQuantity && Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName) && Objects.equals(content, book.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, pageQuantity, content);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pageQuantity=" + pageQuantity +
                ", content='" + content + '\'' +
                '}';
    }
}
