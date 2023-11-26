package java_frappe.problems.week5;


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
        this(writer, 0, "불명");
    }
    public Book(String writer, int year){
        this(writer,year,"불명");
    }

    public String toString(){
            return "저자는 " + writer + ", 발매년도는 " + year + " 출판사는 " + publisher + "입니다.";
    }

    public static void main(String[] args) {
        Book book1 = new Book("양병현",2023,"정시템");
        Book book2 = new Book("표준성");
        Book book3 = new Book("임시훈",2022);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }

}
