import java.awt.Color;

public class NinjaCat extends Critter {
    private int infections;

    public NinjaCat() {
        infections = 0;
    }

    public String toString() {
        return "NCat";
    }

    public Color getColor() {
        if (infections == 0) {
            return Color.YELLOW;
        } else if (infections == 1) {
            return Color.ORANGE;
        }

        return Color.RED;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Critter.Neighbor.OTHER && infections < 2) {
            infections++;
            return Action.INFECT;
        } else if (info.getFront() == Critter.Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}
