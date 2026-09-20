# Fencing Equipment Design Patterns

## Project Description

This Java project demonstrates several design patterns using a fencing equipment and fencing blade system.

The project includes:

- Builder Pattern
- Factory Method Pattern
- Abstract Factory Pattern

The Builder Pattern creates fencing equipment sets.

The Factory Method Pattern creates individual fencing blades:
- Foil
- Epee
- Sabre

The Abstract Factory Pattern creates families of fencing blades from different manufacturers:
- BF
- StM


## Factory Method Pattern

### Structure

Product:
Blade

Concrete Products:
- FoilBlade
- EpeeBlade
- SabreBlade

Creator:
BladeFactory

Concrete Creators:
- FoilBladeFactory
- EpeeBladeFactory
- SabreBladeFactory

### How It Works

Each concrete factory creates one type of blade.

Example:

BladeFactory foilFactory = new FoilBladeFactory();
Blade foilBlade = foilFactory.createBlade();
foilBlade.displayInfo();

The client works with the BladeFactory and Blade interfaces instead of creating concrete blade objects directly.


## Abstract Factory Pattern

### Abstract Products

- Foil
- Epee
- Sabre

### Product Families

BF family:
- BFFoil
- BFEpee
- BFSabre

StM family:
- StMFoil
- StMEpee
- StMSabre

### Abstract Factory

FencingBladeFactory

It contains:

Foil createFoil();
Epee createEpee();
Sabre createSabre();

### Concrete Factories

- BFBladeFactory
- StMBladeFactory

Each factory creates a complete family of related blades.

For example, BFBladeFactory creates:

- BFFoil
- BFEpee
- BFSabre

StMBladeFactory creates:

- StMFoil
- StMEpee
- StMSabre


## Clean Code Principles

### 1. Meaningful Names

Before:

Sabre crateSabre();

After:

Sabre createSabre();

The corrected method name clearly describes its purpose and follows the same naming style as createFoil() and createEpee().


### 2. Small Methods

Each factory method has only one responsibility.

Example:

public Foil createFoil() {
    return new BFFoil();
}

The method only creates and returns a Foil product.


### 3. Single Responsibility Principle

Different classes have different responsibilities.

Blade products represent blades.

BladeFactory classes create individual blade objects.

FencingBladeFactory creates families of related products.

FencingBladeClient uses the created products.

This keeps creation logic separate from client logic.


### 4. Program to Interfaces

Before:

BFFoil foil = new BFFoil();

After:

Foil foil = factory.createFoil();

The client depends on the Foil interface and FencingBladeFactory instead of directly depending on concrete classes.

This reduces coupling between the client and concrete products.


### 5. DRY (Don't Repeat Yourself)

Before, separate client logic could be written for every manufacturer.

After, the same FencingBladeClient works with both factories:

FencingBladeClient bfClient =
        new FencingBladeClient(new BFBladeFactory());

FencingBladeClient stmClient =
        new FencingBladeClient(new StMBladeFactory());

The same client code can work with different product families without duplicating its internal logic.


## Output Example

Factory Method

Blade type: Foil
Blade type: Epee
Blade type: Sabre

Abstract Factory

BF Blades:
BF Foil Blade
BF Epee Blade
BF Sabre Blade

StM Blades:
StM Foil Blade
StM Epee Blade
StM Sabre Blade


## Conclusion

The Factory Method Pattern is used to create individual blade types without directly creating concrete products in the client.

The Abstract Factory Pattern is used to create families of related Foil, Epee, and Sabre blades.

The project demonstrates how design patterns can reduce coupling, separate object creation from usage, and make the code easier to extend.
