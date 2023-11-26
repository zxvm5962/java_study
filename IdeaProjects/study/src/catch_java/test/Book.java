package catch_java.test;

public class Book {
    String writer;
    int year;
    String publisher;

    public Book(String writer, int year, String publisher){
        this.writer = writer;
        this.year = year;
        this.publisher = publisher;
    }
    public Book(String writer){
        this.writer = writer;
    }
    public Book(String writer, int year){
        this.writer = writer;
        this.year = year;
    }

    public String toString(){
        if (publisher != null){
            return "저자는 " + writer + ", 발매년도는 " + year + " 출판사는 " + publisher + "입니다.";
        }
        else if (year != 0) {
            return "저자는 " + writer + ", 발매년도는 " + year + "입니다.";
        }
        else
            return "저자는 " + writer + "입니다.";
    }

    public static void main(String[] args) {
        Book book1 = new Book("양병현",2023,"정시템");
        Book book2 = new Book("정유경");
        Book book3 = new Book("양병현",2022);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }

}
