package model.profession.dwarf.warrior.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class WhrilingAxe implements Ability {

    private final String NAME = "Whriling axe";
    private final int COLDOWN = 2;
    private final int CONSUMPTION = 30;

    @Override
    public void getAbility() {

    }
}
