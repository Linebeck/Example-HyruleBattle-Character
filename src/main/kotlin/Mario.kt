import com.destroystokyo.paper.profile.ProfileProperty
import com.linebeck.hyrulebattle.abstracts.JvmCharacter
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.entity.Player
import org.bukkit.event.entity.*
import org.bukkit.event.player.*
import org.bukkit.inventory.ItemStack

/*
 * HyruleBattle Character Example
 *
 * NOTICE: Make sure you rename the character to the created character in HyruleBattle.
 *
 */

class Mario : JvmCharacter(
    "Mario",
    ProfileProperty( // Upload & Get Texture data from: https://mineskin.org/
        "textures",
        "ewogICJ0aW1lc3RhbXAiIDogMTcwMDAxMTYwMTk5OCwKICAicHJvZmlsZUlkIiA6ICJhMjk1ODZmYmU1ZDk0Nzk2OWZjOGQ4ZGE0NzlhNDNlZSIsCiAgInByb2ZpbGVOYW1lIiA6ICJMZXZlMjQiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNzRmOTdhMTE4MTcyYWViMWRmNmMwODcxMjNlMWMxMjA3OWUwZTgwMDNhYjM0ZGZlODBiYjgwODRiZTg3Y2VjZSIsCiAgICAgICJtZXRhZGF0YSIgOiB7CiAgICAgICAgIm1vZGVsIiA6ICJzbGltIgogICAgICB9CiAgICB9CiAgfQp9",
        "ZkqzKnTjx6VTl/WgzSTMUiP5Rn+WSw9rDO5JkEuTsZVG1u9zbD1lrwFQyVtjg6IAP51uZZeMaT4wX1H7qujZVpFr3QwaAaFUBNuM74d77Rhp8Uf0F8bgPkVoQQ8VshTcT6/2wECRIQ+Z7DcTO706PYf4hLUsL1/jwTtqFpo7o0e2AyJKDmOeeYKp9eoGF+XSko4WAggrz3Zwz443VGtfbe+GEGE/1R7DMCDFFhbomvInVsyVcNh/V1o3LUZkoUVEB27T+s+IMzHaqp97uHfaywqsm5amIwF3Ibp5EnDzWJSMVTi1hu1bWQ7fe6Jr+RpuEK5wOCdtgCo02pZVkBKok4vs0izTuBsrJyaErATokZEPIejPE8u3028sP5Rp8fWpQxU9sLOpOoNimqGYHdBqJ1Uvnlcx6em9/RCEQ7FtOjDamcqOjo24iRwxjuOzvr+a3Rr+yZEFhhBUv0hg1det9B555oeFPVwUFT56Ohw6bjI2OKwcFG9Mr6WmrhmxbexyHArMpVm+x7ltWgY3aYBui9/hOLCavO1LwZI/Qr0nC3UCLS67mD46XAVRY8/D8Uc99k+ygSr4uDBzN/WyRgheL8UQAk0kyX+q/FeE8OP7IrpwtXWWzG8UX6X9WMk3ifpKg3fAYWVA3ql+OyxGpp/mDTBDBqARTzRoOGxLzJtd+9g="
    ),
    "hyrulecore.sounds.mario", // This reflects the resource-pack's sound location.
    health = 20.0f, // 2.0f = 1 heart.
) {

    // Set the contents of the player's inventory.
    override fun setEquipment(player: Player) {
        // Giving Mario a Diamond Axe.
        player.inventory.setItem(0, ItemStack(Material.DIAMOND_AXE))
        player.inventory.setItem(1, ItemStack(Material.STICK))
    }

    // Runs every game tick. WARNING: This should be handled with care.
    override fun tick() {

    }

    // When the player interacts with an item they are holding.
    override fun onInteractItem(event: PlayerInteractEvent) {
        val item = event.item ?: return
        val player = event.player
        if(item.type == Material.STICK) {

            // Send the player a message.
            val text = Component.text("You interacted with a stick!")
            player.sendMessage(text)
        }
    }

    // When the player interacts with an entity. (Player, Mobs, etc.)
    override fun onInteractEntity(event: PlayerInteractEntityEvent) {
        val entity = event.rightClicked
        if(entity.type == EntityType.PLAYER) {

            val text = Component.text("Mario interacted with you!")
            entity.sendMessage(text)
        }
    }

    // When the player attacks another player.
    override fun onAttack(event: EntityDamageByEntityEvent) {
        val damage = event.damage
        val entity = event.entity // Person receiving damage.
        val player = event.damager // Player attacking.


    }

    // When the player attacks another player using a bow.
    override fun onBowAttack(event: EntityDamageByEntityEvent) {

    }

    // When the player shoots a bow.
    override fun onBowShoot(event: EntityShootBowEvent) {

    }

    // When the player attacks another player with a projectile that is not an arrow. (Snowball, Egg, etc.)
    override fun onProjectileAttack(event: EntityDamageByEntityEvent) {

    }

    // When the player launches a projectile. (Snowball, Egg, etc.)
    override fun onProjectileLaunch(event: ProjectileLaunchEvent) {

    }

    // When a player holds an item.
    override fun onHeld(event: PlayerItemHeldEvent) {

    }

    // When a player toggles sneak.
    override fun onSneak(event: PlayerToggleSneakEvent) {
        if(event.isSneaking) {
            val player = event.player
            val text = Component.text("Player is sneaking!")
            player.sendMessage(text)
        }
    }

    // When a player picks up an arrow.
    override fun onPickupArrow(event: PlayerPickupArrowEvent) {

    }

    // When a player moves. WARNING: This should be handled with care.
    override fun onMove(event: PlayerMoveEvent) {
        val to = event.to
        val from = event.from

        if(to.y > from.y) {
            val player = event.player
            player.sendMessage(Component.text("You are moving upwards!"))
        }
    }

    // When an Item of the same type merges.
    override fun onItemMerge(event: ItemMergeEvent) {

    }

    // When a player is hurt by another entity or player.
    override fun onHurt(event: EntityDamageByEntityEvent) {
        val player: Player = event.entity as Player
        player.sendMessage(Component.text("You are hurt!"))
    }

    // When a player is hurt by anything.
    override fun onHurt(event: EntityDamageEvent) {
        val cause = event.cause

        // Prevent fall damage.
        if(cause == EntityDamageEvent.DamageCause.FALL) {
            event.isCancelled = true
        }
    }
}