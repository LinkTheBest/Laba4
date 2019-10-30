public class Skills {

    private String name;
    private String information;
    private int mana;

    public Skills(String name, String information) {
        this.name = name;
        this.information = information;
        mana = 100;
    }

    public Skills(String name, String information, int mana) {
        this.name = name;
        this.information = information;
        this.mana = mana;
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

    public int getMana() {
        return mana;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
