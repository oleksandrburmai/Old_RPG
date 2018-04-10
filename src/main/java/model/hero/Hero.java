package model.hero;

import lombok.Getter;
import lombok.Setter;
import model.race.Race;

@Getter
@Setter
public class Hero {

    private final double START_HEALTH = 100.0;
    private final double START_MANA_POINT = 100.0;
    private final double START_RAGE_POINT = 100.0;

    private String heroName;
    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;
    private double health;
    private double manaPoint;
    private double ragePoint;
    private HeroRanks heroRank;


    public Hero(String heroName, HeroRanks rank, Race race) {
        this.heroName = heroName;
        this.raceName = race.getRaceName();
        this.professionName = race.getProfessionName();
        this.charisma = race.getCharisma();
        this.stamina = race.getStamina();
        this.intellect = race.getIntellect();
        this.agility = race.getAgility();
        this.concentration = race.getConcentration();
        this.heroRank = rank;
        this.health = calculateHealth();
        this.manaPoint = calculateMana();
        this.ragePoint = calculateRage();
    }

    public double calculateHealth() {
        return START_HEALTH + this.stamina * 2;
    }

    public double calculateMana() {
        return START_MANA_POINT + this.intellect * 2;
    }

    public double calculateRage() {
        return START_RAGE_POINT + this.agility * 4;
    }

}
