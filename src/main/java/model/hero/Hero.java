package model.hero;

import lombok.Getter;
import lombok.Setter;
import model.race.Race;

@Getter
@Setter
public class Hero {

    private String heroName;
    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;
    private int health;
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
    }

}
