package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class SpellShield implements Ability {

    private final String NAME = "Spell shield";
    private final int COLDOWN = 2;
    private final int CONSUMPTION = 15;

    @Override
    public void getAbility() {

    }
}
