package model.profession.dwarf.mechanist.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class DroidToArms implements Ability {

    private final String NAME = "Droid to arms";
    private final int COLDOWN = 3;
    private final int CONSUMPTION = 25;

    @Override
    public void getAbility() {

    }
}
