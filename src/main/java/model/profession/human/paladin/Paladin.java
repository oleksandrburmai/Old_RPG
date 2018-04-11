package model.profession.human.paladin;

import model.profession.ProfessionName;
import model.race.type.Human;

public class Paladin extends Human {

    public Paladin() {
        super(ProfessionName.PALADIN.getProfessionName());
    }
}
