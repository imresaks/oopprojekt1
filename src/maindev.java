import java.util.Scanner;

public class maindev {
    public static void main(String[] args) {
        //System.out.println(valemid.piirkuluKapital(100, 5, 8));
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
        System.out.println("Palju sul oli aasta tagasi töötajaid");
        int L1 = scanner.nextInt();
        System.out.println(L1);
        System.out.println("Palju oli sul aasta tagasi kapitali (masinad, töövahendid jne)?");
        int K1 = scanner.nextInt();
        System.out.println(K1);
        System.out.println("Palju on sul praegu töötajaid?");
        int L2 = scanner.nextInt();
        System.out.println(L2);
        System.out.println("Palju on sul praegu kapitali?");
        int K2 = scanner.nextInt();
        System.out.println(K2);
        System.out.println("Palju muutus sinu tootmiskogus võrreldes eelmise aastaga?");
        int deltaQ = scanner.nextInt();
        System.out.println(deltaQ);
        System.out.println("Palju maksab praegu üks ühik kapitali?");
        int r = scanner.nextInt();
        System.out.println(r);
        System.out.println();
        ValemidPalkKogukulu ressurss = new ValemidPalkKogukulu(deltaQ, K1, K2, L1, L2, r);
        System.out.println(ressurss);
        System.out.println(ressurss.kogukulu());

    }

    private static void hinnaMuutmine() {
        System.out.println("hinnamuutmine");

    }
}
