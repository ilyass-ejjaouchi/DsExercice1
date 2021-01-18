public class LivreeState extends CommandeState {

    public LivreeState(Commande commande) {
        super(commande);
    }

    @Override
    public void passerCommande() {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void annulerCommande() {
         commande = null;
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
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void validation() {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void paiement() {
        throw new IllegalStateException("impossible ...");
    }

    @Override
    public void livraison() {
        throw new IllegalStateException("impossible ...");
    }
}
