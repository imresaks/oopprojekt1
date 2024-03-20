public class ValemidElastsus {
    private double H1;
    private double H2;
    private double Q1;
    private double Q2;

    public ValemidElastsus(double h1, double h2, double q1, double q2) {
        H1 = h1;
        H2 = h2;
        Q1 = q1;
        Q2 = q2;
    }
    public double hinnaelastsus(){
        double elastsus=((Q2-Q1)/Q1)/((H2-H1)/H1);
        if (elastsus<0)elastsus=elastsus*-1;
        if (H2>H1) {
            if (elastsus == 1) {
                System.out.println("Sinu toote/teenuse hinnaelastsus on " + elastsus + ", ehk on ühikelastne.");
                System.out.println("See tähendab, et kui tõstsid hinda, siis kogus muutub täpselt samas proportsioonis, aga vastassuunas, sama kehtib hinda alandades");
                System.out.println("Soovitame hinnakujunduse pidevat jälgimist ja kohandamist vastavalt turuolukorrale!");
            }
            if (elastsus < 1) {
                System.out.println("Sinu toote/teenuse hinnaelastsus on " + elastsus + ", ehk on mitte elastne.");
                System.out.println("See tähendab, et sinu toode/teenus pole nii tundlik hinnamuutusele");
                System.out.println("Soovitame sul jätkata oma praguse hinnatõusu strateegiaga, aga mõistlikuse piires!");
                System.out.println("Võiks ka kaaluda kvaliteedi või lisaväärtuse suurendamist veelgi, et õigustada kõrgemat hinda ja suurendada kasumit");
            }
            if (elastsus > 1) {
                System.out.println("Sinu toote/teenuse hinnaelastsus on " + elastsus + ", ehk on elastne.");
                System.out.println("See tähendab, et sinu toode/teenus on üsna tundlik hinnamuutusele");
                System.out.println("Soovitame sul hinda pigem mitte tõsta, sest nii väheneb su müügikogus");
                System.out.println("Võiks ka kaaluda oma toote/teenuse eristamist teistest konkurentidest, et tarbija kohe hinna väiksemagi tõusu juures teise odavama tootja juurde üle ei läheks");


            }
        }
        if (H2<H1) {
            if (elastsus == 1) {
                System.out.println("Sinu toote/teenuse hinnaelastsus on " + elastsus + ", ehk on ühikelastne.");
                System.out.println("See tähendab, et kui muutsid hinda odavamaks, siis kogus muutub täpselt samas proportsioonis, aga vastassuunas, sama kehtib hinda tõstes");
                System.out.println("Soovitame hinnakujunduse pidevat jälgimist ja kohandamist vastavalt turuolukorrale!");
            }
            if (elastsus < 1) {
                System.out.println("Sinu toote/teenuse hinnaelastsus on " + elastsus + ", ehk on mitte elastne.");
                System.out.println("See tähendab, et sinu toode/teenus pole nii tundlik hinnamuutusele");
                System.out.println("Soovitame sul hinda pigem tõsta, aga mõistlikuse piires!");
                System.out.println("Võiks ka kaaluda kvaliteedi või lisaväärtuse suurendamist, et õigustada kõrgemat hinda ja suurendada kasumit");
            }
            if (elastsus > 1) {
                System.out.println("Sinu toote/teenuse hinnaelastsus on " + elastsus + ", ehk on elastne.");
                System.out.println("See tähendab, et sinu toode/teenus on üsna tundlik hinnamuutusele");
                System.out.println("Soovitame sul jätkata praguse strateegiaga, et pigem hinda alanadada, sest nii suureneb su müügikogus");
                System.out.println("Võiks ka kaaluda oma toote/teenuse eristamist teistest konkurentidest, et ei peaks kõige odavamat toodet turul hoidma. See võib küll koguseid suurendada, aga brändi kuvand jääb pigem odav ja mittekvaliteetne");


            }
        }
        return elastsus;
    }
}
