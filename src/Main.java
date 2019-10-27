import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skills> mr_scuperfield_skills = new ArrayList<>();
        ArrayList<Skills> mr_spruts_skill = new ArrayList<>();
        ArrayList<Skills> rabotyaga_skills = new ArrayList<>();



        LilGuys mr_spruts = new LilGuys("Спрутс");
        mr_spruts.setType(LilGuyType.RICH_GUY);
        LilGuys mr_scuperfield = new LilGuys("Скуперфильд");
        mr_scuperfield.setType(LilGuyType.RICH_GUY);
        LilGuys miga = new LilGuys("Мига");
        LilGuys gulio = new LilGuys("ЖУЛИО");

        mr_spruts_skill.add(new Skills("Подкупать владельцев газет", null));
        mr_spruts_skill.add(new Skills("Иметь много деняк", null));
        mr_spruts.setSkills(mr_spruts_skill);

        mr_scuperfield_skills.add(new Skills("Иметь макаронную фабрику", null));
        mr_scuperfield_skills.add(new Skills("Сесть на мель", null));
        mr_scuperfield_skills.add(new Skills("Сокращать зарплату работягам", null));
        mr_scuperfield.setSkills(mr_scuperfield_skills);

        rabotyaga_skills.add(new Skills("Возмущаться", null));
        rabotyaga_skills.add(new Skills("Бросать работу", null));


        for (int i = 0; i < 50; i++){
            System.out.print(i + " ");
            LilGuys rabotyaga = new LilGuys("Работяга");
            rabotyaga.setType(LilGuyType.RABOTYAGA);
            rabotyaga.setSkills(rabotyaga_skills);
        }



        Place fantastic_city = new Place(" город");
        fantastic_city.addThing(new Thing("Фабрика"));
        fantastic_city.addThing(new Thing("Издательство 'продажная газетка'"));

        System.out.println(mr_scuperfield.equals(miga));

    }
}
