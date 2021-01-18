
public abstract class CommandeState {
    protected Commande commande;

    public CommandeState(Commande commande) {
        this.commande = commande;
    }

    public abstract void passerCommande();
    public abstract void annulerCommande();
    public abstract void retirerProduit(Produit produit);
    public abstract void ajouterProduit(Produit produit);
    public abstract void efface();
    public abstract void validation();
    public abstract void paiement();
    public abstract void livraison();
}
