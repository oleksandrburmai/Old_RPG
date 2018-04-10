package model.profession.elf;

import model.profession.elf.gunslinger.Gunslinger;
import model.profession.elf.mage.Mage;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class ElfProfessionMap {

    public Map<String, Race> getElfProfession() {
        Map<String, Race> elfProfession = new HashMap<>();

        elfProfession.put("mage", new Mage());
        elfProfession.put("gunslinger", new Gunslinger());

        return elfProfession;
    }
}
