package model.team;

import lombok.Getter;
import lombok.Setter;
import model.hero.Hero;
import model.hero.HeroRanks;
import model.profession.ProfessionMap;
import util.input.InputData;

@Getter
@Setter
public class Team {

    private static final int TEAM_MEMBERS = 3;

    private Hero[] heroes;

    public void createTeam() {
        Hero[] heroes = new Hero[TEAM_MEMBERS];
        heroes[0] = createLiederHero();
        for (int i = 1; i < TEAM_MEMBERS; i++) {
            System.out.println("Create " + i + " comrade hero");
            heroes[i] = createComradeHero();
        }
        this.heroes = heroes;
    }

    private Hero createComradeHero() {
        String heroName = InputData.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName, HeroRanks.COMRADE,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }

    private Hero createLiederHero() {
        System.out.println("Create leader hero");
        String heroName = InputData.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName, HeroRanks.LEADER,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }
}
