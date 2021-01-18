public class App {
    public static void main(String[] args) {
        Produit p1 = new Produit(1,"produit1");
        Produit p2 = new Produit(1,"produit2");
        Produit p3 = new Produit(1,"produit3");
        Commande c = new Commande();
        c.passerCommande();
        c.ajouterProduit(p1);
        c.ajouterProduit(p2);
        c.ajouterProduit(p3);
        c.retirerProduit(p2);
        c.validerCommande();
        c.payerCommande();
        c.livrerCommande();
    }
}
