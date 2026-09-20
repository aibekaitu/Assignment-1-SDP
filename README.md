# Fencing Equipment Project

## Project Description

This project demonstrates three design patterns in Java:

- Builder Pattern
- Factory Method Pattern
- Abstract Factory Pattern

The program is based on fencing.

The user chooses a weapon:
- Foil
- Epee
- Sabre

Then the user chooses a blade manufacturer:
- BF
- StM

The program creates the blade and fencing equipment based on the user's choice.


## Builder Pattern

The Builder Pattern is used to create a fencing equipment set.

### Structure

Product:
FencingEquipmentSet

Builder:
FencingEquipmentBuilder

Director:
FencingEquipmentDirector

Client:
Main

The Director can create equipment sets for:
- Foil
- Epee
- Sabre


## Factory Method Pattern

The Factory Method Pattern is used to create a blade depending on the selected weapon.

### Product

Blade

### Concrete Products

- FoilBlade
- EpeeBlade
- SabreBlade

### Creator

BladeFactory

### Concrete Creators

- FoilBladeFactory
- EpeeBladeFactory
- SabreBladeFactory

Example:

Before:

Blade blade = new FoilBlade();

After:

BladeFactory bladeFactory = new FoilBladeFactory();
Blade blade = bladeFactory.createBlade();

Now the creation of the blade is handled by the factory.


## Abstract Factory Pattern

The Abstract Factory Pattern is used to create blade families from different manufacturers.

### Abstract Products

- Foil
- Epee
- Sabre

### BF Family

- BFFoil
- BFEpee
- BFSabre

### StM Family

- StMFoil
- StMEpee
- StMSabre

### Abstract Factory

FencingBladeFactory

It has three methods:

Foil createFoil();
Epee createEpee();
Sabre createSabre();

### Concrete Factories

- BFBladeFactory
- StMBladeFactory

BFBladeFactory creates BF blades.

StMBladeFactory creates StM blades.


## How The Patterns Work Together

First, the user chooses a weapon.

For example:

1 - Foil
2 - Epee
3 - Sabre

Factory Method creates the selected blade type.

Then the user chooses the manufacturer:

1 - BF
2 - StM

Abstract Factory creates the selected blade from this family.

Builder creates the equipment set for the selected weapon.


## Clean Code Principles

### 1. Meaningful Names

Before:

Sabre crateSabre();

After:

Sabre createSabre();

The second name is clear and correctly describes what the method does.


### 2. Small Methods

Each factory method does only one task.

Example:

public Foil createFoil() {
    return new BFFoil();
}

This method only creates a foil blade.


### 3. Single Responsibility

Each class has its own responsibility.

FencingEquipmentBuilder builds the equipment.

BladeFactory creates blades.

FencingBladeFactory creates blade families.

FencingBladeClient works with the selected family.

Main handles the user's choice.


### 4. Program to Interfaces

Before:

BFFoil foil = new BFFoil();

After:

Foil foil = factory.createFoil();

The client works with the Foil interface instead of directly depending on BFFoil.


### 5. DRY

Before, separate code could be written for every manufacturer.

After, the same FencingBladeClient can work with different factories.

Example:

FencingBladeClient client =
        new FencingBladeClient(familyFactory);

The client can work with BFBladeFactory or StMBladeFactory without creating a different client.


## Example Output

Choose fencing weapon:
1 - Foil
2 - Epee
3 - Sabre

1

Factory Method:
Blade type: Foil

Choose blade manufacturer:
1 - BF
2 - StM

2

Abstract Factory:
StM Foil Blade

Fencing Equipment Set:
=== Fencing Equipment Set ===
Weapon: Foil
Mask: Foil Mask
Jacket Size: M
Glove Size: M
Hand: Right


## Conclusion

This project uses Builder, Factory Method, and Abstract Factory patterns.

Builder creates the fencing equipment set.

Factory Method creates the selected blade type.

Abstract Factory creates blades from different manufacturer families.

All three patterns are connected through the user's weapon and manufacturer choices.
