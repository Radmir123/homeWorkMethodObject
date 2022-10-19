
import java.util.Objects;
public class Book {

    private final String name;
    private int dateOfPublic;
    private Author author;

    public Book (String name, int dateOfPublic, Author author){
        this.name = name;
        this.dateOfPublic = dateOfPublic;
        this.author = author;
    }
     public String getName() {
        return this.name;
    }


    public int getDateOfPublic() {
        return this.dateOfPublic;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setDateOfPublic(int dateOfPublic) {
        this.dateOfPublic = dateOfPublic;
    }
    //метод toString
    public String toString(){
        return this.name + this.dateOfPublic + this.author;
    }

    //метод equals
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name) &&
                dateOfPublic == book.dateOfPublic &&
                author.equals(book.author);
    }

    // метод hashCode
    @Override
    public int hashCode() {
        return (int) dateOfPublic * name.hashCode() * author.hashCode();
    }



}
