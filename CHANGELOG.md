# Mod Change Log
All notable changes to this mod project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/) and uses a custom versioning system.

## Version 0.3.2 - 2016-11-07
### Fixed
- Resolved [#10](https://github.com/yooksi/Better-Archery-Reborn/issues/10) Model override issue

## Version 0.3.1 - 2016-11-02
### Added
- Longbow item recipes.
- Custom item model class.

### Fixed
- Some incorrect recipes.

### Changed
- Expanded testing world.
- Longbow item internal name.
- Reduced amount of model files.

## Version [0.3.0] - 2016-10-29
### Added
- A new bow type, longbow.
- New custom world for testing purposes.
- Durability for bow bodies.
- Full pallet of grip colors.
- More bow recipes.

### Changed
- Improved arrow velocity calculation.
- Disable durability damage in creative mode.
- Rebalanced bow speed multipliers.
- Reorganized texture and model files.
- Bow tooltip info.

### Fixed
- Body crafting issue
- Bow pulling animation issue.
- Resolved [#6](https://github.com/yooksi/Better-Archery-Reborn/issues/6) Bow off-hand display issue
- Resolved [#7](https://github.com/yooksi/Better-Archery-Reborn/issues/7) Hand rendering issue 

## Version [0.2.9] - 2016-10-21
### Added
- A bow string item used in crafting.
- Bows strings have durability and will take damage same as bows.
- When bow string breaks, the bow will become an unstrung bow.
- NBT tag compounds for bow items.
- More bow item recipes.

### Changed
- Bow durability damage is now based on world difficulty.
- Brought back all previously removed bow item parts.
- Changed existing bow recipes.

## Version [0.2.8] - 2016-10-19
### Added
- Simple and recurve bow tooltip info.
- Two new items for crafting bows with recipes.
- Recipes for all current mod items.

### Changed
- Item names in-game.
- Subtype model registration.
- How EventHandler is registered.
- Simple and recurve bow max durability.
- Removed most bow item parts.

### Fixed
- Major model loading issue.

## Version [0.2.7] - 2016-10-16
### Added
- New item color variant system for bows and parts.
- New bow and bow part item variants.

### Changed
- Removed a lot of redundant model and texture files.
- Refactored a big portion of code base. 
- Updated language files.

## Version [0.2.6] - 2016-10-14
### Added
- BowItemPartBody item with one variant.
- New RecurveBow item variant. 
- New SimpleBow item variant.
- Leather grip texture. 

### Changed
- Removed ServerProxy class.
- Renamed and moved model files.
- Updated resource language files.

## Version [0.2.5] - 2016-10-14
### Added
- Many new bow texture layers.

### Changed
- Updated old textures and their project files.
- Renamed init.Items class.
- SimpleBow recipe.
- build.gradle file.

## Version [0.2.4] - 2016-10-12
### Added
- Recipe handling methods.
- Removed vanilla bow recipe.
- New recipe for SimpleBow.

### Changed
- Renamed RegularBow to SimpleBow.

## Version [0.2.3] - 2016-10-11
### Added
- Bow arrow velocity controller.

### Changed
- Durability for RecurveBow.
- Arrow velocity for RecurveBow.

## Version [0.2.2] - 2016-10-11
### Added
- Bow pulling animation speed controller.
- Mod EventHandler for general Forge events.
- FOV zooming effect when pulling the bow.

### Fixed
- Resolved [#2](https://github.com/yooksi/Better-Archery-Reborn/issues/2) Bows not zooming in when pulled.

## Version [0.2.1] - 2016-10-10
### Added
- Support texture project files.

### Changed
- Improved RecurveBow textures.

### Fixed
- Resolved: [#3](https://github.com/yooksi/Better-Archery-Reborn/issues/3) RecurveBow animation is missing an arrow.

## Version [0.2.0] - 2016-10-09
### Added
- A new bow type, recurve bow.
- Custom textures for RecurveBow.
- Language support for RecurveBow.
- Texture project files in textures\items\projects.

## Version [0.1.6] - 2016-10-09
### Added
- New abstract parent class for all custom bows.

### Changed
- Replaced ResourceLibrary with init.Items
- Updated RegularBow Item to new standards.

## Version [0.1.5] - 2016-10-09
### Added
- Language files for US and GB.
- Language support for RegularBow and creative tab.

## Version [0.1.4] - 2016-10-09
### Fixed
- Resolved: [#1](https://github.com/yooksi/Better-Archery-Reborn/issues/1) RegularBow model animation issue

### Changed
- .gitignore has been updated with more rules.

## Version [0.1.3] - 2016-10-09
### Added
- A new bow type, regular bow.

## Version [0.1.2] - 2016-10-09
### Added
- Resource Library for storing block and item instances.
- Block and item registration with Forge.

## Version [0.1.1] - 2016-10-09
### Added
- Network support for client and server.
- Custom mod creative tab.

### Changed
- Main mod class name.

## Version [0.1.0] - 2016-10-09
### Added
- A readme file.
- Main mod classes.
- Meta files needed by Eclipse.

[0.3.0]: https://github.com/yooksi/Better-Archery-Reborn/compare/87a2fd28961d89636963b0bf5487590f1104e13e...43fa315837cc5f28c5d1c3ed8972751e2aacdec0
[0.2.9]: https://github.com/yooksi/Better-Archery-Reborn/compare/3fd203337c9b8717051f1c34ef70bfdb4e583ade...87a2fd28961d89636963b0bf5487590f1104e13e
[0.2.8]: https://github.com/yooksi/Better-Archery-Reborn/compare/3a9b4e68a9f2963be63e995cef15a12169ca9c34...3fd203337c9b8717051f1c34ef70bfdb4e583ade
[0.2.7]: https://github.com/yooksi/Better-Archery-Reborn/pull/4
[0.2.6]: https://github.com/yooksi/Better-Archery-Reborn/compare/2d9909a488866cc40b8d027df4207d7208f2a9f5...cb70b9184b4bf9d61aab7189b81642b4fc5073e4
[0.2.5]: https://github.com/yooksi/Better-Archery-Reborn/compare/147fea16124b64cb243ca02a0d96cc673e03a0c4...2d9909a488866cc40b8d027df4207d7208f2a9f5
[0.2.4]: https://github.com/yooksi/Better-Archery-Reborn/compare/a36dc013a05b9d7a5f2b475832ad4fbf70010dd8...147fea16124b64cb243ca02a0d96cc673e03a0c4
[0.2.3]: https://github.com/yooksi/Better-Archery-Reborn/compare/df13f19798bf11b561af539ad2dabd23177ea83d...a36dc013a05b9d7a5f2b475832ad4fbf70010dd8
[0.2.2]: https://github.com/yooksi/Better-Archery-Reborn/compare/e8bb23afe03903ea83f2d141b77a5fcd1b8ec34a...df13f19798bf11b561af539ad2dabd23177ea83d
[0.2.1]: https://github.com/yooksi/Better-Archery-Reborn/compare/cbf7233f3aa6f3173ec3afc4846bab09ddc0d3ee...e8bb23afe03903ea83f2d141b77a5fcd1b8ec34a
[0.2.0]: https://github.com/yooksi/Better-Archery-Reborn/compare/4500b7395764db49c5dbd587b59ccffbafeb32fe...cbf7233f3aa6f3173ec3afc4846bab09ddc0d3ee
[0.1.5]: https://github.com/yooksi/Better-Archery-Reborn/commit/c0c5a80fa7fd615b93ec42dbc14672a84b862bee
[0.1.6]: https://github.com/yooksi/Better-Archery-Reborn/commit/4500b7395764db49c5dbd587b59ccffbafeb32fe
[0.1.4]: https://github.com/yooksi/Better-Archery-Reborn/commit/99ab2984b444ff9c76138a495f77e7e5c195c3c1
[0.1.3]: https://github.com/yooksi/Better-Archery-Reborn/commit/d4707c731dbc9f025ee79733c115bc1f023fddae
[0.1.2]: https://github.com/yooksi/Better-Archery-Reborn/commit/785c7492a0b08482d91da34f7aa98002bbfcc3a9
[0.1.1]: https://github.com/yooksi/Better-Archery-Reborn/commit/6c1fab8c3dd1347815c7ffd8ece730ad39d17a9d
[0.1.0]: https://github.com/yooksi/Better-Archery-Reborn/compare/080c474bc42a577f441af5cb6e00cd4c11c42d98...259a476c59f2d498a267f76f459f4bca594eea9c