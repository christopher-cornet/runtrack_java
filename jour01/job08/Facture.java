public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;

        // Montant du produit HT
        double tarifHT = prix * quantite;

        // La Taxe
        double tva = tarifHT * 20 / 100;
        
        // Montant TTC
        double tarifTTC = tarifHT + tva;
        
        System.out.println("Le montant total (HT) est : " + tarifHT);

        System.out.println("Le montant de la taxe est : " + tva);

        System.out.println("Le montant total à payer est : " + tarifTTC);
    }
}