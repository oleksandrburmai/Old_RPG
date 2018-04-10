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
        System.out.println("Stamina - " + team.getHeroes()[i].getStamina() + "." + " Agility - " +
                team.getHeroes()[i].getAgility() + "." + " Charisma - " + team.getHeroes()[i].getCharisma() + "." +
                " Intellect - " + team.getHeroes()[i].getIntellect() + "." +
                " Concentration - " + team.getHeroes()[i].getConcentration() + ".\n");

    }


}
