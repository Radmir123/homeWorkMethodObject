public class Main {
    public static void main(String[] args) {
        Book book = new Book("war and peace, ", 1869, new Author(", Lev", " Tolstoy") );
        Book book2 = new Book("Капитанская дочь", 2020, new Author("Alexandr", "Pushkin") );

        Author author = new Author("Alexandr ", "Pushkin");
        Author author1 = new Author("Alexandr ","Pushkin");

        // метод toString
        System.out.println(book.toString());
        System.out.println(author.toString());

        // метод equals
        System.out.println(author.equals(author1));
        System.out.println(book.equals(book2));


        // метод hashcode
        System.out.println(author.hashCode());
        System.out.println(author1.hashCode());

        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());
    }
}