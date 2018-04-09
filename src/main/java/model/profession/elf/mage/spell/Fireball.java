package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class Fireball implements Ability {

    private final String NAME = "Fireball";
    private final int COLDOWN = 3;
    private final int CONSUMPTION = 45;

    @Override
    public void getAbility() {

    }
}
