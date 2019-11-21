
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);
    private static Random rnd = new Random();
    private static float salary;
    private static int decision;
    public static void main(String[] args) throws SalaryNullException, ThingDoesNotException {

        ArrayList<Skills> mr_scuperfield_skills = new ArrayList<>();
        ArrayList<Skills> mr_spruts_skill = new ArrayList<>();
        ArrayList<Skills> rabotyaga_skills = new ArrayList<>();

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

        System.out.println("Задайте зарплату для работяг в формате 'X,X': ");
        System.out.println("Для выхода введите -1");

        try {
            salary = scn.nextFloat();
        }catch (Exception e){
            System.out.println("Неверный формат числа, зарплата будет сгенерирована автоматически");
            salary = (float)Math.random();
            if(salary == 0){
                throw new SalaryNullException();
            }
        }


        for(int i = 0 ; i < 10; i++) {
            System.out.println();
            System.out.print(i+1 + " ");
            LilGuys rabotyaga = new LilGuys("Работяга");
            rabotyaga.setType(LilGuyType.RABOTYAGA);
            rabotyaga.setSkills(rabotyaga_skills);
            rabotyaga.setSalary(salary);
            try{
                Thread.sleep(500);
            }catch (InterruptedException thr){}
        }

        System.out.println("############################################################################################");
        System.out.println();

        Place fantastic_city = new Place(" город");
        fantastic_city.addThing(new Thing("Фабрика"));
        fantastic_city.addThing(new Thing("Издательство 'продажная газетка'"));
        fantastic_city.addThing(new Thing("Издательство 'Любая статья за ваши деньги'"));
        fantastic_city.addThing(new Thing("Издательство 'Вы заплатите, мы напишем!'"));
        System.out.println();

        System.out.println("############################################################################################");
        System.out.println();
        System.out.println("Мига и ЖУЛИО сбежали");
        System.out.println("Мистер Спрутс проявил скилл: "+ mr_spruts_skill.get(1));
        System.out.println("Мистер Спрутс проявил скилл: "+ mr_spruts_skill.get(0));
        System.out.println("Мистер Скуперфильд проявил скилл: "+ mr_scuperfield_skills.get(5));

        while (salary != -1) {
            if (salary >= 1) {
                System.out.print("Работяги будут ");
                System.out.println(rabotyaga_skills.get(0));
                break;
            } else {
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
