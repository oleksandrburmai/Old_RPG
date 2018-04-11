package model.hero;

final class StatUtil {

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
}
