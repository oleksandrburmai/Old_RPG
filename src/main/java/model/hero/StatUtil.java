package model.hero;

import util.input.InputData;
import util.output.OutPutData;

public final class StatUtil {

    private static final double START_HEALTH = 100.0;
    private static final double START_MANA_POINT = 100.0;
    private static final double START_RAGE_POINT = 100.0;

    private StatUtil() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of StatUtil");
    }

    public static double calculateHealth(HeroStat heroStat) {
        return START_HEALTH + heroStat.getStamina() * 2;
    }

    public static double calculateMana(HeroStat heroStat) {
        return START_MANA_POINT + heroStat.getIntellect() * 2;
    }

    public static double calculateRage(HeroStat heroStat) {
        return START_RAGE_POINT + heroStat.getAgility() * 4;
    }

    public static void addHeroStat(Hero hero) {
        int statPoint = 10;
        OutPutData.printStatDistributeInfo(statPoint);
        while (statPoint > 0) {
            String selectedStat = InputData.choiceStat();
            int distributedPoint = InputData.numberOfPoint(statPoint);
            choiceStat(hero, selectedStat, distributedPoint);
            statPoint -= distributedPoint;
            if (statPoint > 0) {
                System.out.println("You have " + statPoint + " characteristics that can be distributed");
            }
        }
    }

    private static void choiceStat(Hero hero, String selectedStat, int point) {
        switch (selectedStat) {
            case "1":
                hero.getHeroStat().setStamina(point);
                break;
            case "2":
                hero.getHeroStat().setAgility(point);
                break;
            case "3":
                hero.getHeroStat().setCharisma(point);
                break;
            case "4":
                hero.getHeroStat().setIntellect(point);
                break;
            case "5":
                hero.getHeroStat().setConcentration(point);
                break;
        }
    }
}
