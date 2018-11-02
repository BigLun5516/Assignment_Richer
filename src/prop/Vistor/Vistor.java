package prop.Vistor;

import player.Identity.BaiFuMei;
import player.Identity.GaoFuShuai;
import player.Identity.Identity;
import player.Player;

public abstract class Vistor {
    abstract public void visit(BaiFuMei targetIdentity, Player user);
    abstract public void visit(GaoFuShuai targetIdentity, Player user);
}
