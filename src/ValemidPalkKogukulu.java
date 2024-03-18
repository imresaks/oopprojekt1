public class ValemidPalkKogukulu {
    int deltaQ;
    int K1;
    int K2;
    int L1;
    int L2;
    int r;

    public ValemidPalkKogukulu(int deltaQ, int k1, int k2, int l1, int l2, int r) {
        this.deltaQ = deltaQ;
        this.K1 = k1;
        this.K2 = k2;
        this.L1 = l1;
        this.L2 = l2;
        this.r = r;
    }
    public double piirkuluKapital(){
        return (double) this.deltaQ / (this.K2 - this.K1);
    }
    public double piirkuluTööjõud(){
        return (double) this.deltaQ / (this.L2 - this.L1);
    }
    public double palk(){
        return this.r * piirkuluTööjõud() / piirkuluKapital();
    }
    public double kogukulu(){
        return palk() * this.L2 + this.r * this.K2;
    }

    @Override
    public String toString() {
        return "Valemid{" +
                "deltaQ=" + deltaQ +
                ", K1=" + K1 +
                ", K2=" + K2 +
                ", L1=" + L1 +
                ", L2=" + L2 +
                ", r=" + r +
                '}';
    }
}
