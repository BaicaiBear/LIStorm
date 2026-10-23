package top.bearcabbage.lanterninstorm.content;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

/** Placement restrictions are independent of lamp radius and existing block survival. */
public final class LampPlacementRules {
  private LampPlacementRules() {}

  public static boolean canPlace(ResourceKey<Level> dimension, SpiritLanternBlock lamp) {
    var id = dimension.identifier();
    boolean metalOnly =
        id.getNamespace().equals("starryskies") || id.toString().equals("mirrortree:bedroom");
    return !metalOnly
        || lamp == StormContent.LAMPS.get("midas_gold_lantern")
        || lamp == StormContent.LAMPS.get("morkite_lantern")
        || lamp == StormContent.LAMPS.get("starrite_lantern")
        || lamp == StormContent.LAMPS.get("prometheum_lantern");
  }
}
