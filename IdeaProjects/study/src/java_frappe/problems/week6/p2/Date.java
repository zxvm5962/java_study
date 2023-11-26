package java_frappe.problems.week6.p2;

public class Date {
    private String month;
    private int day;
    private int year;
    public Date(String month, int day, int year) {
        setDate(month, day, year);
    }
    public Date(Date aDate) {
        if(aDate == null) { //Not a real date.
            System.out.println("Fatal Error.");
            System.exit(0);
        }
        this.month = aDate.month;
        this.day = aDate.day;
        this.year = aDate.year;
    }
    public void setDate(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public String toString() {
        return (month + " " + day + ", " + year);
    }
}
