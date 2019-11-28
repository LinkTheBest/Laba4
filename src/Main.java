
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scn = new Scanner(System.in);
    private static Random rnd = new Random();
    private static float salary;
    private static int decision;

    public static void main(String[] args) throws SalaryNullException, ThingDoesNotExistException {

        ArrayList<Skills> mr_scuperfield_skills = new ArrayList<>();
        ArrayList<Skills> mr_spruts_skill = new ArrayList<>();
        ArrayList<Skills> rabotyaga_skills = new ArrayList<>();
        ArrayList<Skills> bezrabotnye_skills = new ArrayList<>();

        System.out.println("╔═══╗╔═══╗╔═╗╔═╗╔═══╗     ╔═══╗╔════╗╔═══╗╔═══╗╔════╗╔═══╗╔═══╗\n" +
                "║╔═╗║║╔═╗║║║╚╝║║║╔══╝     ║╔═╗║║╔╗╔╗║║╔═╗║║╔═╗║║╔╗╔╗║║╔══╝╚╗╔╗║\n" +
                "║║─╚╝║║─║║║╔╗╔╗║║╚══╗     ║╚══╗╚╝║║╚╝║║─║║║╚═╝║╚╝║║╚╝║╚══╗─║║║║\n" +
                "║║╔═╗║╚═╝║║║║║║║║╔══╝     ╚══╗║──║║──║╚═╝║║╔╗╔╝──║║──║╔══╝─║║║║\n" +
                "║╚╩═║║╔═╗║║║║║║║║╚══╗     ║╚═╝║──║║──║╔═╗║║║║╚╗──║║──║╚══╗╔╝╚╝║\n" +
                "╚═══╝╚╝─╚╝╚╝╚╝╚╝╚═══╝     ╚═══╝──╚╝──╚╝─╚╝╚╝╚═╝──╚╝──╚═══╝╚═══╝");



        LilGuys mr_spruts = new LilGuys("Спрутс");
        LilGuys.Age age = new LilGuys.Age();
        age.setAge();
        mr_spruts.setType(LilGuyType.RICH_GUY);
        LilGuys mr_scuperfield = new LilGuys("Скуперфильд");
        LilGuys.Age age_one = new LilGuys.Age();
        age_one.setAge();
        mr_scuperfield.setType(LilGuyType.RICH_GUY);
        LilGuys miga = new LilGuys("Мига");
        LilGuys.Age age_second = new LilGuys.Age();
        age_second.setAge();
        LilGuys gulio = new LilGuys("ЖУЛИО");
        LilGuys.Age age_third = new LilGuys.Age();
        age_third.setAge();

        mr_spruts_skill.add(new Skills("Подкупать владельцев газет", null));
        mr_spruts_skill.add(new Skills("Иметь много деняк", null));
        mr_spruts.setSkills(mr_spruts_skill);

        mr_scuperfield_skills.add(new Skills("Иметь макаронную фабрику", null));
        mr_scuperfield_skills.add(new Skills("Сесть на мель", null));
        mr_scuperfield_skills.add(new Skills("Сокращать зарплату работягам", null));
        mr_scuperfield_skills.add(new Skills("Не повышать зарплату работягам", null));
        mr_scuperfield_skills.add(new Skills("Повышать зарплату работягам", null));
        mr_scuperfield_skills.add(new Skills("Сбросить акции", null));
        mr_scuperfield_skills.add(new Skills("Нанять безработных", null));
        mr_scuperfield.setSkills(mr_scuperfield_skills);

        rabotyaga_skills.add(new Skills("Терпеть и работать", null));
        rabotyaga_skills.add(new Skills("Возмущаться", null));
        rabotyaga_skills.add(new Skills("Бросать работу", null));
        rabotyaga_skills.add(new Skills("Требовать повышения зарплаты", null));

        bezrabotnye_skills.add(new Skills("Не хотеть наниматься", null));

        System.out.println("Задайте зарплату для работяг в формате 'X,X': ");
        System.out.println("Для выхода введите -1");

        try {
            salary = scn.nextFloat();
        }catch (Exception e){
            System.out.println("Неверный формат числа, зарплата будет сгенерирована автоматически");
            try {
                salary = (float) Math.random();
            }catch (SalaryNullException ex){
                ex.getMessage();
            }

        }


        for(int i = 0 ; i < 3; i++) {
            System.out.println();
            System.out.print(i+1 + " ");
            LilGuys rabotyaga = new LilGuys("Работяга");
            LilGuys.Age age_rab = new LilGuys.Age();
            age_rab.setAge();
            rabotyaga.setType(LilGuyType.RABOTYAGA);
            rabotyaga.setSkills(rabotyaga_skills);
            try {
                rabotyaga.setSalary(salary);
            }catch (SalaryNullException ex){
                System.out.println(ex.getMessage());
                break;
            }
            try{
                Thread.sleep(500);
            }catch (InterruptedException thr){}
        }

        System.out.println("############################################################################################");
        System.out.println();

        for (int i = 0; i < 3; i++){
            System.out.print(i+1 + " ");
            LilGuys bezrabotnye = new LilGuys("Безработный");
            LilGuys.Age age_bezrab = new LilGuys.Age();
            age_bezrab.setAge();
            bezrabotnye.setType(LilGuyType.BEZRABOTNYE);
            bezrabotnye.setSkills(bezrabotnye_skills);
            try{
                Thread.sleep(500);
            }catch (InterruptedException thr){}

        }

        System.out.println("############################################################################################");
        System.out.println();

        Place fantastic_city = new Place(" Брехенвиль");
        miga.run();
        gulio.run();
        try {
            fantastic_city.addThing(new Thing("Фабрика"));
            fantastic_city.addThing(new Thing("Издательство 'продажная газетка'"));
            fantastic_city.addThing(new Thing("Издательство 'Любая статья за ваши деньги'"));
            fantastic_city.addThing(new Thing("Издательство 'Вы заплатите, мы напишем!'"));
        }catch (ThingDoesNotExistException ex){
            ex.getMessage();
        }

        Place gazeta = new Place(" Газета");
        try{
            gazeta.addThing(new Thing("Снимки с несгораемыми сундуками"));
            gazeta.addThing(new Thing("Снимки с несгораемой кассой"));
            gazeta.addThing(new Thing("Снимки веревки"));
        }catch (ThingDoesNotExistException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();

        System.out.println("############################################################################################");
        System.out.println();
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

                decision = rnd.nextInt(6);

                if (decision <= 3) {
                    System.out.println("Мистер Скуперфильд решил: " + mr_scuperfield_skills.get(3));
                    System.out.println("Тогда работяги решили: " + rabotyaga_skills.get(2));
                    System.out.println("Мистер Скуперфильд решил: " + mr_scuperfield_skills.get(6));
                    System.out.println("Безработные решили: " + bezrabotnye_skills.get(0));
                    System.out.println("Мистер Скуперфильд решил: " + mr_scuperfield_skills.get(1));
                    salary = 0;
                    break;
                }

                if(decision > 3){
                    System.out.println("Мистер Скуперфильд решил: " + mr_scuperfield_skills.get(4));
                    salary =(float)Math.random() * 10;
                    System.out.print("Теперь зарплата: ");
                    System.out.println(String.format("%.1f",salary));

                }
            }
        }
    }
}
