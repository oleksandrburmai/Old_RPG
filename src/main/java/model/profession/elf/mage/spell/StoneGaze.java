package model.profession.elf.mage.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class StoneGaze implements Ability {

    private final String NAME = "Stone gaze";
    private final int COOLDOWN = 4;
    private final int CONSUMPTION = 20;

    @Override
    public void getAbility() {

    }
}
