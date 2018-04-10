package model.profession.human.priest.skill;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class LayOfFists implements Ability {

    private final String NAME = "Lay of fists";
    private final int COOLDOWN = 3;
    private final int CONSUMPTION = 10;

    @Override
    public void getAbility() {

    }
}
