package model.profession;

import model.profession.dwarf.mechanist.Mechanist;
import model.profession.dwarf.warrior.Warrior;
import model.profession.elf.gunslinger.Gunslinger;
import model.profession.elf.mage.Mage;
import model.profession.human.paladin.Paladin;
import model.profession.human.priest.Priest;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class ProfessionMap {

    public static Map<String, Map<String, Race>> getProfession() {
        Map<String, Map<String, Race>> profession = new HashMap<>();

        profession.put("elf", getElfProfession());
        profession.put("dwarf", getDwarfProfession());
        profession.put("human", getHumanProfession());

        return profession;
    }

    private static Map<String, Race> getElfProfession() {
        Map<String, Race> elfProfession = new HashMap<>();

        elfProfession.put("mage", new Mage());
        elfProfession.put("gunslinger", new Gunslinger());

        return elfProfession;
    }

    private static Map<String, Race> getHumanProfession() {
        Map<String, Race> humanProfession = new HashMap<>();

        humanProfession.put("priest", new Priest());
        humanProfession.put("paladin", new Paladin());

        return humanProfession;
    }

    private static Map<String, Race> getDwarfProfession() {
        Map<String, Race> dwarfProfession = new HashMap<>();

        dwarfProfession.put("warrior", new Warrior());
        dwarfProfession.put("mechanist", new Mechanist());

        return dwarfProfession;
    }
}
