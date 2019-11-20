public class Thing implements InterfaceThings {

    private String name;
    private int counter;
    private boolean visible;

    public Thing(String name) {
        this.name = name;
        counter = 1;
        visible = true;
    }

    public Thing(String name, int counter) {
        this.name = name;
        this.counter = counter;
        visible = true;
    }

    public Thing(String name, int counter, boolean visible) {
        this.name = name;
        this.counter = counter;
        this.visible = visible;
    }

    public String getName() {
        if (name.equals(null)) {
            return " ";
        }
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public boolean isVisible() {
        return visible;
    }


    public boolean equals(Thing obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
