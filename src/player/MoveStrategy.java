package player;

import block.Block;

public abstract class MoveStrategy {
    public abstract Block move(Player player);
}
