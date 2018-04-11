package model.profession.dwarf.mechanist.skill;

import lombok.Getter;
import model.profession.Ability;
import model.profession.dwarf.mechanist.MechanistAbilitiesStat;

@Getter
public class DroidToArms implements Ability {

    private String name;
    private int cooldown;
    private int consumption;

    DroidToArms() {
        this.name = MechanistAbilitiesStat.DROIDTOARMS.getAbilityName();
        this.cooldown = MechanistAbilitiesStat.DROIDTOARMS.getCooldown();
        this.consumption = MechanistAbilitiesStat.DROIDTOARMS.getConsumption();
    }

    @Override
    public void getAbility() {

    }
}
