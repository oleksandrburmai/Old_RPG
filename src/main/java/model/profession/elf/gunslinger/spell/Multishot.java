package model.profession.elf.gunslinger.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class Multishot implements Ability {

    private final String NAME = "Multishot";
    private final int COOLDOWN = 2;
    private final int CONSUMPTION = 30;

    @Override
    public void getAbility() {

    }
}
