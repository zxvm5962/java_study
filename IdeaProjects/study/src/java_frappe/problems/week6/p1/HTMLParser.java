package java_frappe.problems.week6.p1;

public class HTMLParser implements Parseable {
    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
    @Override
    public boolean typeCheck(String fileType){
        return fileType.equals("html");
    }
}