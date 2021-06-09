public class Project {

    private String name;
    private String description;
    private double initialCost;

    // To create empty projects
    public Project(){}

    public Project(String name) {
        this.name = name;
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost) {
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    // get and set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get and set description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // get and set initial cost
    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    // elevator pitch
    public String pitch() {
        return name + " ("+ initialCost +")" + ": " + description;
    }
}