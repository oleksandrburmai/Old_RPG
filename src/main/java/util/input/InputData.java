package util.input;

import model.profession.ProfessionMap;
import util.ScannerUtil;

public class InputData {

    public static String getRaceName() {
        System.out.println("Choice one of this race " + ProfessionMap.getProfession().keySet());
        while (true) {
            String race = ScannerUtil.getString();
            if (ProfessionMap.getProfession().containsKey(race.toLowerCase())) {
                return race;
            } else {
                System.out.println("Race chosen incorrectly. Try again");
            }
        }
    }

    public static String getProfessionName(String raceName) {
        System.out.println("Choice one of this profession " + ProfessionMap.getProfession().get(raceName).keySet());
        while (true) {
            String profession = ScannerUtil.getString();
            if (ProfessionMap.getProfession().get(raceName).containsKey(profession.toLowerCase())) {
                return profession;
            } else {
                System.out.println("Choice wrong profession. Try again");
            }
        }
    }

    public static String getHeroName() {
        System.out.println("Enter hero name");
        return ScannerUtil.getString();
    }

}
