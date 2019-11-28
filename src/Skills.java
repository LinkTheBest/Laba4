public class Skills {

    private String name;
    private String information;

    public Skills(String name, String information) {
        this.name = name;
        this.information = information;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        if (information.equals(null)) {
            return " ";
        }
        return information;
    }

    public boolean equals(Skills obj) {
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
