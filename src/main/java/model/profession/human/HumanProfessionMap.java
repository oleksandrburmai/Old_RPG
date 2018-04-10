package model.profession.human;

import model.profession.human.paladin.Paladin;
import model.profession.human.priest.Priest;
import model.race.Race;

import java.util.HashMap;
import java.util.Map;

public class HumanProfessionMap {

    public Map<String, Race> getHumanProfession() {
        Map<String, Race> humanProfession = new HashMap<>();

        humanProfession.put("priest", new Priest());
        humanProfession.put("paladin", new Paladin());

        return humanProfession;
    }
}
