import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("test");
        Scanner obj = new Scanner(System.in);
        System.out.println("Millega on sul täna abi vaja?");
        System.out.println("Hinna muutmine (h)");
        System.out.println("Ressurside optimiseerimine (r)");
        System.out.println("Motivatsiooniprobleemid (m)");

        String sisend = obj.nextLine();
        System.out.println(sisend);
    }
}
