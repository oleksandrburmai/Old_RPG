package model.hero;

import model.profession.MapKeys;
import util.input.InputData;
import util.output.OutPutData;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Void> statMap = new HashMap();
        statMap.put(MapKeys.ONE.getKey(), hero.getHeroStat().setStamina(point));
        statMap.put(MapKeys.TWO.getKey(), hero.getHeroStat().setAgility(point));
        statMap.put(MapKeys.THREE.getKey(), hero.getHeroStat().setCharisma(point));
        statMap.put(MapKeys.FOUR.getKey(), hero.getHeroStat().setIntellect(point));
        statMap.put(MapKeys.FIVE.getKey(), hero.getHeroStat().setConcentration(point));
        if (statMap.containsKey(selectedStat)) {
            statMap.get(selectedStat);
        }
    }
}
