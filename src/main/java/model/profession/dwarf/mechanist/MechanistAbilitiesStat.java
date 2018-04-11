package model.profession.dwarf.mechanist;

import lombok.Getter;

@Getter
public enum MechanistAbilitiesStat {

    BOMBS("Bombs", 2, 25), DROIDTOARMS("Droid to arms", 3, 30);

    private String abilityName;
    private int cooldown;
    private int consumption;

    MechanistAbilitiesStat(String abilityName, int cooldown, int consumption) {
        this.abilityName = abilityName;
        this.cooldown = cooldown;
        this.consumption = consumption;
    }
}
