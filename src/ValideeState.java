public class ValideeState extends CommandeState {

    public ValideeState(Commande commande) {
        super(commande);
    }

    @Override
    public void passerCommande() {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void annulerCommande() {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void retirerProduit(Produit produit) {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void ajouterProduit(Produit produit) {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void efface() {
        commande.produits.clear();
    }

    @Override
    public void validation() {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void paiement() {
        commande.commandeState = new PayeeState(commande);
    }

    @Override
    public void livraison() {
        throw new IllegalStateException("impossible ...");
    }
}
