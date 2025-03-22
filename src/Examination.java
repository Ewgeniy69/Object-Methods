public class Examination {
    public static void main(String[] args) {

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Тони", "Тернер");

        Book book1 = new Book("Сказки", author1, 1815);
        Book book2 = new Book("Трейдинг", author2, 2020);

        System.out.println("Запуск приложения!");

        System.out.println("author1.firstName = " + author1.getFirstName() + "," + " author1.lastName = " + author1.getLastName());
        System.out.println("book1.bookTitle = " + book1.getBookTitle() + "," + " book1.author = " + book1.getAuthor() + "," + " book1.year = " + book1.getYear());
        book1.setYear(1820);
        System.out.println("book1.getYear() = " + book1.getYear());

        System.out.println("author2.firstName = " + author2.getFirstName() + "," + " author2.lastName = " + author2.getLastName());
        System.out.println("book2.bookTitle = " + book2.getBookTitle() + "," + " book2.author = " + book2.getAuthor() + "," + " book2.year = " + book2.getYear());

        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));

        System.out.println("HashCode author1: " + author1.hashCode());
        System.out.println("HashCode author2: " + author2.hashCode());
        System.out.println("HashCode book1: " + book1.hashCode());
        System.out.println("HashCode book2 " + book2.hashCode());


    }
}
