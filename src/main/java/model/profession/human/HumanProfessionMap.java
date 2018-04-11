package model.profession.human;

import model.profession.MapKeys;
import model.profession.human.paladin.Paladin;
import model.profession.human.priest.Priest;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class HumanProfessionMap {

    public Map<String, Race> getHumanProfession() {
        Map<String, Race> humanProfession = new HashMap<>();

        humanProfession.put(MapKeys.ONE.getKey(), new Priest());
        humanProfession.put(MapKeys.TWO.getKey(), new Paladin());

        return humanProfession;
    }
}
