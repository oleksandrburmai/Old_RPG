package model.team;

import lombok.Getter;
import lombok.Setter;
import model.hero.Hero;
import model.profession.ProfessionMap;
import util.ScannerUtil;
import util.input.InputData;

@Getter
@Setter
public class Team {
    private final int TEAM_MEMBERS = 3;

    private Hero[] heroes;

    public void createTeam() {
        Hero[] heroes = new Hero[TEAM_MEMBERS];
        for (int i = 0; i < TEAM_MEMBERS; i++) {
            heroes[i] = createHero();
        }
        this.heroes = heroes;
    }

    private Hero createHero() {
        String heroName = InputData.getHeroName();
        String race = InputData.getRaceName();
        return new Hero(heroName,
                ProfessionMap.getProfession().get(race).get(InputData.getProfessionName(race)));
    }
}
