package model.hero;

import lombok.Getter;
import model.race.Race;

@Getter
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

    public Void setCharisma(int charisma) {
        this.charisma = this.charisma + charisma;
        return null;
    }

    public Void setStamina(int stamina) {
        this.stamina = this.stamina + stamina;
        return null;
    }

    public Void setIntellect(int intellect) {
        this.intellect = this.intellect + intellect;
        return null;
    }

    public Void setAgility(int agility) {
        this.agility = this.agility + agility;
        return null;
    }

    public Void setConcentration(int concentration) {
        this.concentration = this.concentration + concentration;
        return null;
    }
}
