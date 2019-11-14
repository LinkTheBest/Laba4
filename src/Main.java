
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);
    private static Random rnd = new Random();
    private static float salary;
    private static int decision;
    public static void main(String[] args) {

        ArrayList<Skills> mr_scuperfield_skills = new ArrayList<>();
        ArrayList<Skills> mr_spruts_skill = new ArrayList<>();
        ArrayList<Skills> rabotyaga_skills = new ArrayList<>();


        System.out.println("  ●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●\n" +
                "░░░░░░░░░░░░░░ WELCOME ░░░░░░░░░░░░░\n" +
                "  ●▬▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬▬●");
        System.out.println("╔═══╗╔═══╗╔═╗╔═╗╔═══╗     ╔═══╗╔════╗╔═══╗╔═══╗╔════╗╔═══╗╔═══╗\n" +
                "║╔═╗║║╔═╗║║║╚╝║║║╔══╝     ║╔═╗║║╔╗╔╗║║╔═╗║║╔═╗║║╔╗╔╗║║╔══╝╚╗╔╗║\n" +
                "║║─╚╝║║─║║║╔╗╔╗║║╚══╗     ║╚══╗╚╝║║╚╝║║─║║║╚═╝║╚╝║║╚╝║╚══╗─║║║║\n" +
                "║║╔═╗║╚═╝║║║║║║║║╔══╝     ╚══╗║──║║──║╚═╝║║╔╗╔╝──║║──║╔══╝─║║║║\n" +
                "║╚╩═║║╔═╗║║║║║║║║╚══╗     ║╚═╝║──║║──║╔═╗║║║║╚╗──║║──║╚══╗╔╝╚╝║\n" +
                "╚═══╝╚╝─╚╝╚╝╚╝╚╝╚═══╝     ╚═══╝──╚╝──╚╝─╚╝╚╝╚═╝──╚╝──╚═══╝╚═══╝");



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
        mr_scuperfield_skills.add(new Skills("Не повышать зарплату работягам", null));
        mr_scuperfield_skills.add(new Skills("Повышать зарплату работягам", null));
        mr_scuperfield_skills.add(new Skills("Сбросить акции", null));
        mr_scuperfield.setSkills(mr_scuperfield_skills);

        rabotyaga_skills.add(new Skills("Терпеть и работать", null));
        rabotyaga_skills.add(new Skills("Возмущаться", null));
        rabotyaga_skills.add(new Skills("Бросать работу", null));
        rabotyaga_skills.add(new Skills("Требовать повышения зарплаты", null));


        for (int i = 0; i < 15; i++) {
            System.out.print(i + " ");
            LilGuys rabotyaga = new LilGuys("Работяга");
            rabotyaga.setType(LilGuyType.RABOTYAGA);
            rabotyaga.setSkills(rabotyaga_skills);
        }


        Place fantastic_city = new Place(" город");
        fantastic_city.addThing(new Thing("Фабрика"));
        fantastic_city.addThing(new Thing("Издательство 'продажная газетка'"));
        fantastic_city.addThing(new Thing("Издательство 'Любая статья за ваши деньги'"));
        fantastic_city.addThing(new Thing("Издательство 'Вы заплатите, мы напишем!'"));

        System.out.println("#######################################################################################");
        System.out.println("Мига и ЖУЛИО сбежали");
        System.out.println("Мистер Спрутс проявил скилл: "+ mr_spruts_skill.get(1));
        System.out.println("Мистер Спрутс проявил скилл: "+ mr_spruts_skill.get(0));
        System.out.println("Мистер Скуперфильд проявил скилл: "+ mr_scuperfield_skills.get(5));

        System.out.println("Для выхода из программы введите: -1");
        System.out.println("Задайте зарплату работягам в фертингах: ");

        try {
            salary = scn.nextFloat();
        }catch (Exception e){}

        while (salary != -1) {
            if (salary >= 1) {
                System.out.print("Работяги будут ");
                System.out.println(rabotyaga_skills.get(0));
                break;
            } else {
                System.out.println(" Мистер Скуперфильд проявил скилл: " + mr_scuperfield_skills.get(2));
                System.out.print("Работяги будут ");
                System.out.println(rabotyaga_skills.get(1));
                System.out.print("Работяги будут ");
                System.out.println(rabotyaga_skills.get(3));

                decision = rnd.nextInt(3);

                if (decision == 0) {
                    System.out.println("Мистер Скуперфильд решил: " + mr_scuperfield_skills.get(3));
                    System.out.println("Тогда работяги решили: " + rabotyaga_skills.get(2));
                    System.out.println("Мистер Скуперфильд: " + mr_scuperfield_skills.get(1));
                    salary = 0;
                    break;
                }

                if(decision != 0){
                    System.out.println("Мистер Скуперфильд решил: " + mr_scuperfield_skills.get(4));
                   salary =(float)Math.random() * 10;
                    System.out.print("Теперь зарплата: ");
                    System.out.println(String.format("%.1f",salary));

                }
            }
        }
    }
}
