package model.profession.human.priest.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class BattleTrance implements Ability {

    private final String NAME = "Battle trance";
    private final int COOLDOWN = 4;
    private final int CONSUMPTION = 65;

    @Override
    public void getAbility() {

    }
}
