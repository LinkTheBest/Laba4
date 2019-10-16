import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skills> skills = new ArrayList<>();

        ArrayList<LilGuys> lilguys = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            System.out.print(i + 1 + " ");
            lilguys.add(new LilGuys());
        }

        LilGuys clever_guy = new LilGuys("Знайка");
        clever_guy.setType(LilGuyType.CLEVERLILGUY);

        skills.add(new Skills("Знать очень много", null));
        skills.add(new Skills("Читать книги", "Читать разные книги"));
        skills.add(new Skills("Умный", "Умный от чтения книг"));
        skills.add(new Skills("Быть похожим на профессора", null));
        skills.add(new Skills("Носить черный костюм и очки", null));
        clever_guy.setSkills(skills);

        Place fantastic_city = new Place(" Сказочный город");
        fantastic_city.addThing(new Thing("улица колокольчиков"));
        fantastic_city.addThing(new Thing("Домик"));
        Place lil_house = new Place(" Домик");
        lil_house.addThing(new Thing("Много книг", 228335));


    }
}
