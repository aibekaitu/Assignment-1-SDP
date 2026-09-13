# Fencing Equipment Builder

## Project Description

This project shows the Builder Pattern in Java.

The program creates fencing equipment sets for three weapon types:
- Foil
- Epee
- Sabre

The user chooses a weapon type. After that, the program creates the correct equipment set.

## Builder Pattern Structure

Product: FencingEquipmentSet

Builder: FencingEquipmentBuilder

Director: FencingEquipmentDirector

Client: Main

## How It Works

The user chooses one weapon:

1 - Foil
2 - Epee
3 - Sabre

The program checks the user's choice.

Then the Director creates the selected equipment set with the Builder.

Example:

Choose fencing weapon:
1 - Foil
2 - Epee
3 - Sabre

3

=== Fencing Equipment Set ===
Weapon: Sabre
Mask: Sabre Mask
Jacket Size: M
Glove Size: M
Hand: Right

## Clean Code Principles

### 1. Meaningful Names

I used clear names for classes, methods, and variables.

For example:

FencingEquipmentSet
FencingEquipmentBuilder
createFoilSet()
createEpeeSet()
createSabreSet()

These names make the code easier to understand.

### 2. Small Methods

My methods are small and have one main task.

For example:

public FencingEquipmentBuilder setWeaponType(String weaponType) {
    this.weaponType = weaponType;
    return this;
}

This method only sets the weapon type.

### 3. Single Responsibility

Each class has its own job.

FencingEquipmentSet stores information about the equipment.

FencingEquipmentBuilder builds the equipment set.

FencingEquipmentDirector creates ready sets for Foil, Epee, and Sabre.

Main gets the user's choice and shows the result.

### 4. Validated Construction

The build() method checks important information before creating the object.

For example:

if (weaponType == null || weaponType.isBlank()) {
    throw new IllegalStateException("Weapon type is required!");
}

If important information is missing, the program shows an error.

This helps prevent creating an incorrect equipment set.

### 5. DRY (Don't Repeat Yourself)

Some code was repeated in the Director.

Before:

builder.setJacketSize("M");
builder.setGloveSize("M");
builder.setHand("Right");
builder.setChestProtector(true);
builder.setFencingBag(true);
builder.setPlastron(true);
builder.setBodyCord(true);

The same code was needed for different weapon sets.

After:

private void setStandardEquipment(FencingEquipmentBuilder builder) {
    builder.setJacketSize("M");
    builder.setGloveSize("M");
    builder.setHand("Right");
    builder.setChestProtector(true);
    builder.setFencingBag(true);
    builder.setPlastron(true);
    builder.setBodyCord(true);
}

Now I can use:

setStandardEquipment(builder);

This makes the code shorter and removes repeated code.

## Conclusion

This project shows how the Builder Pattern works in Java.

The Builder creates the fencing equipment set step by step.

The Director creates ready equipment sets for Foil, Epee, and Sabre.

The user can choose which equipment set they want.
