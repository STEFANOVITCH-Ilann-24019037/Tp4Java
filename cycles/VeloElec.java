package cycles;

/*class VeloElec */

public class VeloElec extends Velo {
    private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private double facteurPuissanceMoteur;

     
    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super.setBraquet(braquet);
        super.setDiamRoue(diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super.setDiamRoue(diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    public VeloElec() {
        this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public static double getDEFAULT_COUPLE_MOTEUR() {
        return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public static void setDEFAULT_COUPLE_MOTEUR(double DEFAULT_COUPLE_MOTEUR) {
        DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAULT_COUPLE_MOTEUR;
    }

    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }

    public void setFacteurPuissanceMoteur(double coupleMoteur) {
        this.facteurPuissanceMoteur = coupleMoteur;
    }

    @Override
    public double getPuissance(double FrequenceCoupsDePedale) {
        return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
    }

    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
    }
}

