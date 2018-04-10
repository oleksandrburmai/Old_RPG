package model.profession;

import model.profession.dwarf.DwarfProfessionMap;
import model.profession.elf.ElfProfessionMap;
import model.profession.human.HumanProfessionMap;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class ProfessionMap {

    public static Map<String, Map<String, Race>> getProfession() {
        Map<String, Map<String, Race>> profession = new HashMap<>();

        profession.put("elf", new ElfProfessionMap().getElfProfession());
        profession.put("dwarf", new DwarfProfessionMap().getDwarfProfession());
        profession.put("human", new HumanProfessionMap().getHumanProfession());

        return profession;
    }

}
