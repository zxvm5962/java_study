package java_frappe.problems.week6.p1;
import java.util.*;
public class ParserManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileType = sc.nextLine();

        Parseable parser = new HTMLParser();
        if(parser.typeCheck(fileType)){
            String fileName = sc.nextLine();
            parser.parse(fileName);
        }
        else{
            System.out.println("Invalid file type.");
        }
    }
}
