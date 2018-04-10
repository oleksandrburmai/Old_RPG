package model.profession.elf.gunslinger.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class BullsEye implements Ability {

    private final String NAME = "Bulls eye";
    private final int COOLDOWN = 3;
    private final int CONSUMPTION = 40;

    @Override
    public void getAbility() {

    }
}
