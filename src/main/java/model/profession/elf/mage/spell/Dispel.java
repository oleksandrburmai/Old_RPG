package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class Dispel implements Ability {

    private final String NAME = "Dispel";
    private final int COOLDOWN = 3;
    private final int CONSUMPTION = 20;

    @Override
    public void getAbility() {

    }
}
