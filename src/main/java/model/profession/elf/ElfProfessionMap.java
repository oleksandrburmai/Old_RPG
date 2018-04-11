package model.profession.elf;

import model.profession.MapKeys;
import model.profession.elf.gunslinger.Gunslinger;
import model.profession.elf.mage.Mage;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class ElfProfessionMap {

    public Map<String, Race> getElfProfession() {
        Map<String, Race> elfProfession = new HashMap<>();

        elfProfession.put(MapKeys.ONE.getKey(), new Mage());
        elfProfession.put(MapKeys.TWO.getKey(), new Gunslinger());

        return elfProfession;
    }
}
