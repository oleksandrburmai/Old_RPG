package model.hero;

import lombok.Getter;
import lombok.Setter;
import model.race.Race;

@Getter
@Setter
public class HeroStat {

    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    public HeroStat setHeroStat(Race race) {
        HeroStat heroStat = new HeroStat();
        heroStat.setCharisma(race.getCharisma());
        heroStat.setStamina(race.getStamina());
        heroStat.setIntellect(race.getIntellect());
        heroStat.setAgility(race.getAgility());
        heroStat.setConcentration(race.getConcentration());
        return heroStat;
    }

}
