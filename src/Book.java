import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int year;

    public Book(String bookTitle, Author author, int year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.year = year;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название: " + this.bookTitle + "," + " Автор: " + this.author + "," + " Год издания: " + this.year;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author) && Objects.equals(year, book.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, year);


    }
}
