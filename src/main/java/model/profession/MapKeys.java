package model.profession;

import lombok.Getter;

@Getter
public enum MapKeys {

    ONE("1"), TWO("2"), THREE("3");

    private String key;

    MapKeys(String key) {
        this.key = key;
    }
}
