package OOP_7;

import java.util.ArrayList;

public class Thug extends BaseWalker {

    public Thug(ArrayList<BaseUnit> gang, String name, int x, int y) {
        super("thug", name, 8, 3, new int[]{2, 4}, 10, 6);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}
