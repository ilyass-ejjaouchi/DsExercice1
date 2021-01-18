public class EnAttenteState extends CommandeState {
    public EnAttenteState(Commande commande) {
        super(commande);
    }

    @Override
    public void passerCommande() {
        throw new IllegalStateException("impossible de passer la commende, la commande est deja cree");
    }

    @Override
    public void annulerCommande() {
        commande = null;
    }

    @Override
    public void retirerProduit(Produit produit) {
        if (commande.produits.contains(produit))
        commande.produits.remove(produit);
        else
            throw new IllegalArgumentException("le produit n'existe pas");
    }

    @Override
    public void ajouterProduit(Produit produit) {
        commande.produits.add(produit);
    }

    @Override
    public void efface() {
     commande.produits.clear();
    }

    @Override
    public void validation() {
        commande.commandeState = new ValideeState(commande);
    }

    @Override
    public void paiement() {
        throw new IllegalStateException("impossible....");
    }

    @Override
    public void livraison() {
        throw new IllegalStateException("impossible ......");
    }
}
