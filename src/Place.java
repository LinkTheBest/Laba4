import java.util.ArrayList;

public class Place {

    private String name;
    private Coordinates location;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private ArrayList<Skills> skills = new ArrayList<Skills>();

    public Place(String place_name) {
        name = place_name;
        location = null;
        System.out.println("Место" + name + "  успешно создано");
    }

    public Place(String place_name, Coordinates place_coordinates) {
        name = place_name;
        location = place_coordinates;
        System.out.println("Место" + name + " ( " + location.getName() + " ) успешно создано");

    }

    public String getName() {
        if (name.equals(null)) {
            System.out.println(" ");
        }
        return name;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public ArrayList<Thing> getThing() {
        return things;
    }

    public Coordinates getLocation() {
        return location;
    }

    public boolean addThing(Thing new_thing) {
        if (things.add(new_thing)) {

            System.out.println("В объект \"" + name + "\" успешно добавлено " + new_thing.getName() + " в количестве " + new_thing.getCounter() );
            return true;

        } else {
            System.out.println("Что-то пошло не так...");
            return false;
        }
    }

    public void deleteThing(int id) {
        skills.remove(id);
    }

    public void deleteThing(Thing thing) {
        skills.remove(thing);
    }

    public boolean addSkill(Skills skill) {
        return skills.add(skill);
    }


    public boolean equals(Place obj) {
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
