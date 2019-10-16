import java.util.ArrayList;

public class LilGuys extends SomethingAlive {

    private ArrayList<Skills> skills = new ArrayList<>();
    private LilGuyType type;

    public LilGuys() {
        System.out.println("просто малыш создан");
    }

    public LilGuys(String name) {
        super(name);
        System.out.println("Малыш " + name + " успешно создан");
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void deleteSkill(Skills skills) {
        this.skills.remove(skills);
    }

    public boolean addSkill(Skills new_skill) {
        if (skills.add(new_skill)) {
            System.out.println("Объекту \"" + this.getName() + "\" успешно присвоено умение " + new_skill.getName() + " ( " + new_skill.getInformation() + " )");
            return true;

        } else {
            System.out.println("Что-то пошло не так...");
            return false;
        }
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    public void setType(LilGuyType type){
        this.type = type;
        String typeName = "";
        switch (type){
            case CLEVERLILGUY: typeName = "Главный и умный";
                break;
            case JUSTLILGUY: typeName = "просто чел";
                break;
        }
        System.out.println(getName() + " причислен к виду " + typeName);
    }


}
