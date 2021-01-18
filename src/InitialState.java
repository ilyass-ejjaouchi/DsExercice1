public class InitialState extends CommandeState {

    public InitialState(Commande commande) {
        super(commande);
    }

    @Override
    public void passerCommande() {
            commande.commandeState = new EnAttenteState(commande);
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
