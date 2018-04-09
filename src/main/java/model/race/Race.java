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

    public Race(RaceStartCharacteristics raceStartCharacteristic, String professionName) {
        this.professionName = professionName;
        this.raceName = raceStartCharacteristic.getRaceName();
        this.charisma = raceStartCharacteristic.getCharisma();
        this.stamina = raceStartCharacteristic.getStamina();
        this.intellect = raceStartCharacteristic.getIntellect();
        this.agility = raceStartCharacteristic.getAgility();
        this.concentration = raceStartCharacteristic.getConcentration();
    }
}
