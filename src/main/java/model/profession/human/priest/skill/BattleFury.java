package model.profession.human.priest.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class BattleFury implements Ability {

    private final String NAME = "Battle fury";
    private final int COOLDOWN = 4;
    private final int CONSUMPTION = 30;

    @Override
    public void getAbility() {

    }
}
