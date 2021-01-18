import java.util.ArrayList;
import java.util.List;

public class Commande {
    public List<Produit> produits;
    public CommandeState commandeState;

    public Commande() {
       commandeState = new InitialState(this);
    }

    public void ajouterProduit(Produit produit){
        if (produits == null) produits = new ArrayList<>();
        commandeState.ajouterProduit(produit);
    }
    public void efface(){
        commandeState.efface();
    }
    public void retirerProduit(Produit produit){
        commandeState.retirerProduit(produit);
    }
    public void passerCommande(){
        commandeState.passerCommande();
    }
    public void annulerCommande(){
        commandeState.annulerCommande();
    }
    public void validerCommande() {
        commandeState.validation();
    }
    public void payerCommande() {
        commandeState.paiement();
    }
    public void livrerCommande() {
        commandeState.livraison();
    }
}
