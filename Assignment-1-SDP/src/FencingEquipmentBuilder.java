public class FencingEquipmentBuilder {
    private String weaponType;
    private String mask;
    private String jacketSize;
    private String gloveSize;
    private String hand;
    private boolean chestProtector;
    private boolean plastron;
    private boolean bodyCord;
    private boolean fencingBag;
    public FencingEquipmentBuilder setWeaponType(String weaponType){
        this.weaponType=weaponType;
        return this;
    }
    public FencingEquipmentBuilder setMask(String mask){
        this.mask=mask;
        return this;
    }
    public FencingEquipmentBuilder setJacketSize(String jacketSize){
        this.jacketSize=jacketSize;
        return this;
    }
    public FencingEquipmentBuilder setGloveSize(String gloveSize) {
        this.gloveSize = gloveSize;
        return this;
    }
    public FencingEquipmentBuilder setHand(String hand){
        this.hand=hand;
        return this;
    }

    public FencingEquipmentBuilder setChestProtector(boolean chestProtector) {
        this.chestProtector = chestProtector;
        return this;
    }
    public FencingEquipmentBuilder setPlastron(boolean plastron){
        this.plastron=plastron;
        return this;
    }
    public FencingEquipmentBuilder setBodyCord (boolean bodyCord){
        this.bodyCord=bodyCord;
        return this;
    }
    public FencingEquipmentBuilder setFencingBag(boolean fencingBag){
        this.fencingBag=fencingBag;
        return this;
    }
    public FencingEquipmentSet build() {
        if (weaponType == null || weaponType.isBlank()) {
            throw new IllegalStateException("Weapon type is required!");
        }
        if (mask == null || mask.isBlank()) {
            throw new IllegalStateException("Mask is required!");
        }
        if (jacketSize == null || jacketSize.isBlank()) {
            throw new IllegalStateException("Jacket Size is required");
        }
        if (gloveSize == null || gloveSize.isBlank()) {
            throw new IllegalStateException("Glove Size is required");
        }
        if (hand == null || hand.isBlank()) {
            throw new IllegalStateException("Hand is required");
        }
        return new FencingEquipmentSet(
                weaponType,
                mask,
                jacketSize,
                gloveSize,
                hand,
                chestProtector,
                plastron,
                bodyCord,
                fencingBag
        );
    }

}
