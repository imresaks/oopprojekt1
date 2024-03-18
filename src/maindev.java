import java.util.Scanner;

public class maindev {
    public static void main(String[] args) {
        algus();
    }

    private static void algus() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Millega on sul täna abi vaja?");
        System.out.println("Hinna muutmine (h)");
        System.out.println("Ressurside optimiseerimine (r)");
        System.out.println("Motivatsiooniprobleemid (m)");
        System.out.print("Kirjuta valik siia: ");
        String sisend = obj.nextLine();
        otsustaTegevus(sisend);
    }

    private static void otsustaTegevus(String sisend) {
        switch (sisend) {
            case "h":
                hinnaMuutmine();
                break;
            case "r":
                ressursideOptimiseerimine();
                break;
            case "m":
                motivatsiooniprobleemid();
                break;
            default:
                System.out.println("Halb sisend");
                System.out.println("Vali üks järgnevatest valikutest: h/r/m");
                algus();
                break;
        }
    }

    private static void motivatsiooniprobleemid() {
        System.out.println("motprobleem");
    }

    private static void ressursideOptimiseerimine() {
        System.out.println("ressursid");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta c ehk -");
        int c = scanner.nextInt();
        System.out.println(c);
    }

    private static void hinnaMuutmine() {
        System.out.println("hinnamuutmine");
    }
}
