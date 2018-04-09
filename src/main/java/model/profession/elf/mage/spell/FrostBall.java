package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class FrostBall implements Ability {

    private final String NAME = "Frost ball";
    private final int COLDOWN = 1;
    private final int CONSUMPTION = 20;

    @Override
    public void getAbility() {

    }
}
