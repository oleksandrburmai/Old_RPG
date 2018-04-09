package model.profession.elf.gunslinger.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class RapidFire implements Ability {

    private final String NAME = "Rapid fire";
    private final int COLDOWN = 3;
    private final int CONSUMPTION = 30;

    @Override
    public void getAbility() {

    }
}
