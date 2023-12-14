# Example Character Class for HyruleBattle Plugin

The `Mario` class is a Kotlin class designed for use in the HyruleBattle plugin for Minecraft. This class represents the character Mario and defines various attributes and behaviors for this character within the game.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Customization](#customization)
- [Integration](#integration)
- [Denizen](#Denizen)
- [Contributing](#contributing)
- [License](#license)

## Introduction

In order to get the full Mini-Game advantages that HyruleBattle has to offer, you must use a `JvmCharacter` or custom `Denizen` scripts that listen for HyruleBattle events. 

The `Mario` class is an extension of the HyruleBattle plugin, a custom Zelda-Minecraft themed Mini-game. It provides the following features for the Mario character:

- Initialization with a name, skin texture data, sound resource pack location, and base health.
- Custom equipment setup for Mario's inventory.
- Handling various in-game events, such as item interactions, attacks, movement, sneaking, and more.

## Usage

To use the `Mario` class in your HyruleBattle game mode, follow these steps:

1. Git clone the repository.
2. Rename the `Mario` class to match the character created in HyruleBattle, provide the character's display name, skin texture data, sound resource pack location, and health points.
3. Customize Mario's equipment in the `setEquipment` function by defining the items he should hold in his inventory.
4. Implement the desired character behaviors by overriding the appropriate functions within the `Mario` class.
5. Integrate the character by building the project. Take the `Mario`.class file and insert it into the /implementations folder.
6. Run /hb reload to dynamically re-load all the characters.

## Dependencies

The `Mario` class depends on the following Minecraft and Bukkit dependencies:

- `https://github.com/Linebeck/HyruleBattle-API`
- `https://github.com/PaperMC/Paper`

Please make sure to include these dependencies in your project for proper usage of the `Mario` class.

## Customization

You can customize Mario's equipment and behaviors according to your game mode's requirements. The `setEquipment` function allows you to define the items he should hold in his inventory, and you can override various functions to implement specific character actions.

Here's a brief description of what each method does:

1. `setEquipment(player: Player)`: Sets Mario's inventory contents.

2. `tick()`: Runs every game tick, allowing for periodic character-related logic. (Handle with care.)

3. `onInteractItem(event: PlayerInteractEvent)`: Handles item interactions.

4. `onInteractEntity(event: PlayerInteractEntityEvent)`: Handles interactions with entities (e.g., other players).

5. `onAttack(event: EntityDamageByEntityEvent)`: Handles attacks by Mario.

6. `onBowAttack(event: EntityDamageByEntityEvent)`: Handles attacks with a bow.

7. `onBowShoot(event: EntityShootBowEvent)`: Handles bow shooting.

8. `onProjectileAttack(event: EntityDamageByEntityEvent)`: Handles attacks with non-arrow projectiles (e.g., Snowball, Egg).

9. `onProjectileLaunch(event: ProjectileLaunchEvent)`: Handles launching projectiles (e.g., Snowball, Egg).

10. `onHeld(event: PlayerItemHeldEvent)`: Handles when Mario holds an item.

11. `onSneak(event: PlayerToggleSneakEvent)`: Handles when Mario toggles sneak.

12. `onPickupArrow(event: PlayerPickupArrowEvent)`: Handles when Mario picks up an arrow.

13. `onMove(event: PlayerMoveEvent)`: Handles player movement. (Handle with care.)

14. `onItemMerge(event: ItemMergeEvent)`: Handles item merging.

15. `onHurt(event: EntityDamageByEntityEvent)`: Handles when Mario is hurt by another entity or player.

16. `onHurt(event: EntityDamageEvent)`: Handles when Mario is hurt by anything general. (No damager).

Feel free to modify and extend these methods to customize Mario's behavior according to your game mode's requirements.

## Integration

To integrate the `Mario` character into your HyruleBattle game mode, include this class in your project and instantiate it as needed. Ensure that you have set up the necessary game logic, configurations, and events to handle character interactions and gameplay.

## Denizen

You may toggle characters to use either a JvmCharacter or custom Denizen scripts.

Here are the events that you may use:

1. `com.linebeck.hyrulebattle.events.CharacterAttackEvent`: Fires when a Character Attacks.
2. `com.linebeck.hyrulebattle.events.CharacterBowAttackEvent`: Fires when a Character Attacks with a Bow.
3. `com.linebeck.hyrulebattle.events.CharacterHurtByEntityEvent`: Fires when a Character gets hurt by an entity/player.
4. `com.linebeck.hyrulebattle.events.CharacterHurtEvent`: Fires when a Character is hurt. (Non Entity).
5. `com.linebeck.hyrulebattle.events.CharacterInteractEntityEvent`: Fires when a Character interacts with an entity.
6. `com.linebeck.hyrulebattle.events.CharacterInteractEvent`: Fires when the Character interacts with an item.
7. `com.linebeck.hyrulebattle.events.CharacterItemHeldEvent`: Fires when the Character swaps/holds an item in their inventory.
8. `com.linebeck.hyrulebattle.events.CharacterMoveEvent`: Fires when the Character moves. (Handle with care.)
9. `com.linebeck.hyrulebattle.events.CharacterPickupLaunchedEntityEvent`: Fires when they pick up entities like arrows or tridents.
10. `com.linebeck.hyrulebattle.events.CharacterSetEquipmentEvent`: This is how you set the character's inventory.
11. `com.linebeck.hyrulebattle.events.CharacterSetSkinEvent`: This is how you set the character's skin.
12. `com.linebeck.hyrulebattle.events.CharacterShootBowEvent`: Fires when a Character shoots a bow.
13. `com.linebeck.hyrulebattle.events.CharacterSneakEvent`: Fires when a Character toggles sneak.
14. `com.linebeck.hyrulebattle.events.CharacterTickEvent`: Fires every tick. (Handle with care.)

## Contributing

Contributions to this class or the HyruleBattle plugin are welcome. If you have improvements or additional features to add, please contact me.
## License

This `Mario` class and the HyruleBattle-API plugin are provided under an open-source license. Please refer to the plugin's licensing documentation for more information.

---

Enjoy using the `Mario` class in your HyruleBattle game mode, and have fun customizing and extending it to create a unique character gameplay experience!