package model.profession.dwarf;

import model.profession.dwarf.mechanist.Mechanist;
import model.profession.dwarf.warrior.Warrior;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class DwarfProfessionMap {
    public Map<String, Race> getDwarfProfession() {
        Map<String, Race> dwarfProfession = new HashMap<>();

        dwarfProfession.put("warrior", new Warrior());
        dwarfProfession.put("mechanist", new Mechanist());

        return dwarfProfession;
    }
}
