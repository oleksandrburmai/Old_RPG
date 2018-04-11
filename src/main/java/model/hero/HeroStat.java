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

    public void setCharisma(int charisma) {
        this.charisma = this.charisma + charisma;
    }

    public void setStamina(int stamina) {
        this.stamina = this.stamina + stamina;
    }

    public void setIntellect(int intellect) {
        this.intellect = this.intellect + intellect;
    }

    public void setAgility(int agility) {
        this.agility = this.agility + agility;
    }

    public void setConcentration(int concentration) {
        this.concentration = this.concentration + concentration;
    }
}
