package model.profession.dwarf.mechanist.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class Bombs implements Ability {

    private final String NAME = "Bombs";
    private final int COOLDOWN = 2;
    private final int CONSUMPTION = 25;

    @Override
    public void getAbility() {

    }
}
