package model.profession.dwarf.warrior.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class StandMyGround implements Ability {

    private final String NAME = "Stand my ground";
    private final int COLDOWN = 4;
    private final int CONSUMPTION = 20;

    @Override
    public void getAbility() {

    }
}
