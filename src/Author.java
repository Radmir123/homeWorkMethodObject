import java.util.Objects;
public class Author {

    private String name;
    private String surName;


    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surName;
    }

    //метод toString
        public String toString(){
        return this.name+ this.surName;
    }

    /*
    public boolean equals1(Author author1){
        return this.name == this.surName;
    }
*/
    //метод equals
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name) &&
                surName.equals(author.surName);
    }

    // метод hashCode
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surName);
    }


    }
