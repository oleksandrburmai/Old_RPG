package model.race;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int agility;
    private int concentration;

    public Race(RaceStartDatums startDatums, String professionName) {
        this.professionName = professionName;
        this.raceName = startDatums.getRaceName();
        this.charisma = startDatums.getCharisma();
        this.stamina = startDatums.getStamina();
        this.intellect = startDatums.getIntellect();
        this.agility = startDatums.getAgility();
        this.concentration = startDatums.getConcentration();
    }
}
