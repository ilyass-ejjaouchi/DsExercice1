import java.util.List;

public class Produit {
    public int id;
    public String name;
    public List<Commande> commandes;

    public Produit(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
