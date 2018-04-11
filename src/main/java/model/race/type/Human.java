package model.race.type;

import lombok.Getter;
import model.race.Race;
import model.race.RaceStartDatums;

@Getter
public class Human implements Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int concentration;
    private int agility;

    protected Human(String professionName) {
        this.professionName = professionName;
        this.raceName = RaceStartDatums.HUMAN.getRaceName();
        this.charisma = RaceStartDatums.HUMAN.getCharisma();
        this.stamina = RaceStartDatums.HUMAN.getStamina();
        this.intellect = RaceStartDatums.HUMAN.getIntellect();
        this.agility = RaceStartDatums.HUMAN.getAgility();
        this.concentration = RaceStartDatums.HUMAN.getConcentration();
    }
}