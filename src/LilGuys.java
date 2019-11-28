import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class LilGuys extends SomethingAlive {

    private ArrayList<Skills> skills = new ArrayList<>();
    private LilGuyType type;
    private float salary;
    private static float age;

    public LilGuys() {
        System.out.println("Просто человек создан");
    }

    public LilGuys(String name) {
        super(name);
        System.out.println("Человек " + name + " успешно создан");
    }

    static class Age{
        public void setAge(){
            age = (float) Math.random() * 80;
            System.out.print("Возрат человека: ");
            System.out.printf("%.1f", age);
            System.out.println();
        }
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
            case RICH_GUY: typeName = "богач";
                break;
            case RABOTYAGA: typeName = "работяга";
                break;
            case BEZRABOTNYE: typeName = "безработный черт";
                break;
        }
        System.out.println(getName() + " причислен к виду " + typeName);
    }


        public void setSalary(float sal) throws SalaryNullException{
            if(sal == 0){
                throw new SalaryNullException("Зарплата должна быть больше нуля!");
            }
             class SalaryInfo {
                public void PrintInfo() {
                    System.out.print("Задана зарплата: ");
                    System.out.printf("%.1f", sal);
                    System.out.println();
                }
            }
    }


    public void run(){
        System.out.print(getName() + " решил нагло сбежать!\n");
    }

    public boolean equals(LilGuys obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.getName();
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
