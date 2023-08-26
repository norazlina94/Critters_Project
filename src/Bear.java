import java.awt.Color;

public class Bear extends Critter {
    private boolean polar;
    private int move;

    public Bear(boolean polar){
        this.polar=polar;
    }

    //Color.WHITE for a polar bear (when polar is true),
    //Color.BLACK otherwise (when polar is false)
    public Color getColor() {
        if(polar==true){
            return Color.WHITE;
        }
        else{
            return Color.BLACK;
        }
    }
    /* Alternate on each different move between a slash character(/)
    and a backslash character () starting with a slash.*/
    public String toString(){
        if(move%2==0){
            return "/";
        }
        else{
            return "\\" ;
        }
    }
    /*Always infect if an enemy is in front, otherwise hop if possible,
    otherwise turn left.*/
    public Action getMove(CritterInfo info){
        move++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.WALL){
            return Action.LEFT;
        }
        else{
            return Action.HOP;
        }
    }
}
