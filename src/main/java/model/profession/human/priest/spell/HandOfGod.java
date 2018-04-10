package model.profession.human.priest.spell;

import lombok.Getter;
import model.profession.Ability;

@Getter
public class HandOfGod implements Ability {

    private final String NAME = "Hand of god";
    private final int COOLDOWN = 2;
    private final int CONSUMPTION = 25;

    @Override
    public void getAbility() {

    }
}
