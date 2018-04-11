package util.output;

import model.team.Team;

public class OutPutData {

    public static void printHeroInfo(Team team, int i) {
        System.out.println("Info about hero " + team.getHeroes()[i].getHeroName() + ":");
        System.out.println("Race - " + team.getHeroes()[i].getRaceName() + "." + " Rank - " +
                String.valueOf(team.getHeroes()[i].getHeroRank()).toLowerCase() + "." + " Profession - " +
                team.getHeroes()[i].getProfessionName() + ".");
        System.out.println("Health - " + team.getHeroes()[i].getHealth() + "." + " Mana - " +
                team.getHeroes()[i].getManaPoint() + "." + " Rage - " + team.getHeroes()[i].getRagePoint() + ".");
        System.out.println("Stamina - " + team.getHeroes()[i].getHeroStat().getStamina() + "." + " Agility - " +
                team.getHeroes()[i].getHeroStat().getAgility() + "." + " Charisma - " +
                team.getHeroes()[i].getHeroStat().getCharisma() + "." + " Intellect - " +
                team.getHeroes()[i].getHeroStat().getIntellect() + "." + " Concentration - " +
                team.getHeroes()[i].getHeroStat().getConcentration() + ".\n");
    }

    public static void printRaceInfo() {
        System.out.println("Description of the race:");
        System.out.println("Race - dwarf:\n" + "Stamina - 45. Agility - 20. Charisma - 5. Intellect - 15." +
                " Concentration - 5\n" + "Race - human:\n" + "Stamina - 30. Agility - 15. Charisma - 10. " +
                "Intellect - 20. Concentration - 15\n" + "Race - elf:\n" + "Stamina - 10. Agility - 22." +
                " Charisma - 15. Intellect - 25. Concentration - 18\n");
    }

    public static void printDatumInfo() {
        System.out.println("Description of the characteristics:");
        System.out.println("Stamina give - 2 hp per 1 stamina point, 0,25 hp regen per 1 stamina point.\n" +
                "Agility give – 4 rp per 1 agility point, chance to avoid hit 1% per 2 points.\n" +
                "Charisma give - 1 additional initiative point per 2 charisma points, charisma > " +
                "40 allows you to fear your enemies (0,75% chance per 2 points of charisma), " +
                "2% XP gain on every 2 points.\n" + "Intellect give – 2 mp per 1 intellect point, 0,25 mp regen per " +
                "1 intellect point.\n" + "Concentration give – 1 hp, 1,5 mp/1 rp regen per turn for 1 concentration " +
                "point, 1 turn cd discretion per 25 points.\n");
    }

}
