public class Character {
    public WeaponBehavior m_weapon;
    
    public Character(WeaponBehavior weapon) {
        m_weapon = weapon;
    }

    public void fight() {
        System.out.println("");
    }
}



public class Queen extends Character {
    public Queen() {}
    @Override public void fight() {}
}

public class King extends Character {
    public King() {}
    @Override public void fight() {}
}

public class Knight extends Character {
    public Knight() {}
    @Override public void fight() {}
}

public class Troll extends Character {
    public Troll() {}
    @Override public void fight() {}
}



public class WeaponBehavior {
    public WeaponBehavior() {}
    public void useWeapon() {}
}



public class AxeBehavior extends WeaponBehavior {
    public AxeBehavior() {}
    @Override public void useWeapon() {
        System.out.println("");
    }
}

public class SwordBehavior extends WeaponBehavior {
    public SwordBehavior() {}
}

public class ClubBehavior extends WeaponBehavior {
    public ClubBehavior() {}
}

public class KnifeBehavior extends WeaponBehavior {
    public KnifeBehavior() {}
}

