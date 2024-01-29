

public class Dependents {
    private String name;
    private String relationship;

    public Dependents(String name, String relationship) {
        this.name = name;
        this.relationship = relationship;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for relationship
    public String getRelationship() {
        return relationship;
    }

    // Setter for relationship
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return name + " (" + relationship + ")";
    }
}
