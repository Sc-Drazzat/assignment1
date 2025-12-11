package assignment;

public class Book {
    private int id;
    private static int idGen = 1;
    private String title;
    private String author;
    private int year;
    private boolean available;
    public Book(){
        id = idGen++;
        available = true;
    }
    public Book(String title, String author, int year){
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setTitle(String title){
        if (title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        else
            this.title = title;
    }
    public void setAuthor(String author){
        if (author == null || author.isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        else
            this.author = author;
    }
    public void setYear(int year){
        if (1500 <= year && year <= 2025){
            this.year = year;
        }
        else{
            throw new IllegalArgumentException("Year out of range");
        }
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    public void markAsBorrowed(){
        setAvailable(false);
    }
    public void markAsReturned(){
        setAvailable(true);
    }
    @Override
    public String toString(){
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", available=" + available + "]";
    }
}
