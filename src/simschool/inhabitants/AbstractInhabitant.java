package simschool.inhabitants;

public abstract class AbstractInhabitant {

    public AbstractInhabitant() {
    }

    public AbstractInhabitant(String inputName) {
        this.name = inputName;
    }

    public abstract void Execute();

    public abstract void Start();

    public abstract void Finish();

    public void Display(String message) {
        System.out.println(getName() + ": " + message);
    }

    protected String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
