package model.profession.dwarf.warrior.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class WhirlingAxe implements Ability {

    private final String NAME = "Whirling axe";
    private final int COOLDOWN = 2;
    private final int CONSUMPTION = 30;

    @Override
    public void getAbility() {

    }
}
