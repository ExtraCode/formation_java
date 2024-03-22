package entity;

public class Tache {
    private int id;
    private String description;
    private boolean completee;

    // Constructeur
    public Tache(int id, String description) {
        this.id = id;
        this.description = description;
        this.completee = false; // Par défaut, la tâche n'est pas complétée
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompletee() {
        return completee;
    }

    public void setCompletee(boolean completee) {
        this.completee = completee;
    }

    // Redéfinition de la méthode toString pour afficher les informations de la tâche
    @Override
    public String toString() {
        return "Tache{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", completee=" + completee +
                '}';
    }
}
