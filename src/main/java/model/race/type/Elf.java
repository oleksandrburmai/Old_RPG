package model.race.type;

import lombok.Getter;
import model.race.Race;
import model.race.RaceStartDatums;

@Getter
public class Elf implements Race {

    private String raceName;
    private String professionName;
    private int charisma;
    private int stamina;
    private int intellect;
    private int concentration;
    private int agility;

    protected Elf(String professionName) {
        this.professionName = professionName;
        this.raceName = RaceStartDatums.ELF.getRaceName();
        this.charisma = RaceStartDatums.ELF.getCharisma();
        this.stamina = RaceStartDatums.ELF.getStamina();
        this.intellect = RaceStartDatums.ELF.getIntellect();
        this.agility = RaceStartDatums.ELF.getAgility();
        this.concentration = RaceStartDatums.ELF.getConcentration();
    }
}
