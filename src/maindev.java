import java.util.Scanner;

public class maindev {
    public static void main(String[] args) {
        System.out.println("test");
        Scanner obj = new Scanner(System.in);
        System.out.println("Millega on sul täna abi vaja?");
        System.out.println("Hinna muutmine (h)");
        System.out.println("Ressurside optimiseerimine (r)");
        System.out.println("Motivatsiooniprobleemid (m)");

        String sisend = obj.nextLine();
        otsustaTegevus(sisend);
    }
    private static void otsustaTegevus(String sisend) {
        switch (sisend) {
            case "h":
                hinnaMuutmine(sisend);
                break;
            case "r":
                ressursideOptimiseerimine(sisend);
                break;
            case "m":
                motivatsiooniprobleemid(sisend);
                break;
            default:
                System.out.println("Halb sisend");
                System.out.println("Vali üks järgnevatest valikutest: h/r/m");
                break;
        }
    }

    private static void motivatsiooniprobleemid(String sisend) {
        System.out.println("motprobleem");
    }

    private static void ressursideOptimiseerimine(String sisend) {
        System.out.println("ressursid");
    }

    private static void hinnaMuutmine(String sisend) {
        System.out.println("hinnamuutmine");
    }
}
