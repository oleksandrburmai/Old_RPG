package model.profession.human.paladin.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class Splash implements Ability {

    private final String NAME = "Splash";
    private final int COLDOWN = 2;
    private final int CONSUMPTION = 20;

    @Override
    public void getAbility() {

    }
}
