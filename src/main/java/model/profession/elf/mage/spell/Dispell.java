package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class Dispell implements Ability {

    private final String NAME = "Dispell";
    private final int COLDOWN = 3;
    private final int CONSUMPTION = 20;

    @Override
    public void getAbility() {

    }
}
