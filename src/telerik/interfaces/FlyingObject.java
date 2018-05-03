package telerik.interfaces;

import telerik.game_states.PlayState;

public abstract class FlyingObject extends Entity implements Movable, Updateable, Colidable {
    private int power;

    public FlyingObject(PlayState game) {
        super(game);
        this.addUpdateable();
    }

    public FlyingObject() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
