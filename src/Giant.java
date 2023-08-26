import java.awt.*;

public class Giant extends Critter{
    private int moves;

    public Giant(){
        moves=0;
        getColor();
    }

    public Color getColor (){
        return Color.GRAY;
    }


    public String toString() {
        //"fee" for 6 moves, then "fie" for 6 moves, then "foe" for 6 moves, then "fum" for 6 moves, then repeat.
        if (moves >= 0 && moves <= 5) {
            return "fee";
        } else if (moves >= 6 && moves <= 11) {
            return "fie";
        } else if (moves >= 12 && moves <= 17) {
            return "foe";
        } else {
            return "fum";
        }
    }

    public Action getMove(CritterInfo info) {
        //always infect if an enemy is in front, otherwise hop if possible, otherwise turn right
        //track moves
        moves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }


}