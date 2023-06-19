# DonateCase custom animations


TestAnimation class
```java
import com.jodexindustries.donatecase.api.Animation;
import com.jodexindustries.donatecase.api.Case;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class TestAnimation implements Animation {
    @Override
    public void start(Player player, Location location, String c) {
        final Location lAC = location.clone();
        final String winGroup = Case.getRandomGroup(c);
        final String winGroupId = Case.getWinGroupId(c, winGroup);
        location.add(0.5, 1, 0.5);
        location.setYaw(-70.0F);
        final ArmorStand as = (ArmorStand) player.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
        as.setVisible(false);
        Case.listAR.add(as);
        as.setGravity(false);
        as.setSmall(true);
        as.setCustomNameVisible(true);
        (new BukkitRunnable() {
            int i; // count of ticks
            double t;
            Location l;

            public void run() {
                Material material;
                ItemStack winItem = new ItemStack(Material.TNT);
                lAC.getWorld().spawnParticle(Particle.FALLING_LAVA, rain1, 1);
                lAC.getWorld().spawnParticle(Particle.FALLING_LAVA, rain2, 1);
                lAC.getWorld().spawnParticle(Particle.FALLING_LAVA, rain3, 1);
                lAC.getWorld().spawnParticle(Particle.FALLING_LAVA, rain4, 1);
                lAC.getWorld().spawnParticle(Particle.CLOUD, cloud1, 0);
                lAC.getWorld().spawnParticle(Particle.CLOUD, cloud2, 0);
                lAC.getWorld().spawnParticle(Particle.CLOUD, cloud3, 0);
                lAC.getWorld().spawnParticle(Particle.CLOUD, cloud4, 0);
                Location las = as.getLocation().clone();
                las.setYaw(las.getYaw() + 20.0F);
                as.teleport(las);
                material = Material.getMaterial(winGroupId);
                if (material == null) {
                    material = Material.STONE;
                }
                if (this.i == 0) {
                    this.l = as.getLocation();
                }
                if (this.i >= 14) {
                    this.l.setYaw(las.getYaw());
                    if (this.i == 32) {
                        // win item and title
                        as.setHelmet(winItem);
                        as.setCustomName(winItem.getItemMeta().getDisplayName());
                        Case.onCaseOpenFinish(c, player, false, winGroup);
                        lAC.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, lAC, 0);
                        lAC.getWorld().playSound(lAC, Sound.ENTITY_GENERIC_EXPLODE, 1, 1);
                    }
                }
                // End
                if (this.i >= 70) {
                    as.remove();
                    this.cancel();
                    Case.listAR.remove(as);
                    Case.animationEnd(player, lAC);
                }

                ++this.i;
            }
        }).runTaskTimer(JavaPlugin.getPlugin(Main.class), 0L, 2L);
    }
}

```

Main class (register animation)
```java
public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        AnimationManager.registerAnimation("TEST", TestAnimation.class);
    }
}
```