public class FencingEquipmentDirector {
    public FencingEquipmentSet createFoilSet(){
        FencingEquipmentBuilder builder = new FencingEquipmentBuilder();
        builder.setWeaponType("Foil");
        builder.setMask("Foil Mask");
        builder.setJacketSize("M");
        builder.setGloveSize("M");
        builder.setHand("Right");
        builder.setChestProtector(true);
        builder.setFencingBag(true);
        builder.setPlastron(true);
        builder.setBodyCord(true);
        return builder.build();
    }
    public FencingEquipmentSet createEpeeSet(){
        FencingEquipmentBuilder builder = new FencingEquipmentBuilder();
        builder.setWeaponType("Epee");
        builder.setMask("Epee Mask");
        builder.setJacketSize("M");
        builder.setGloveSize("M");
        builder.setHand("Right");
        builder.setChestProtector(true);
        builder.setFencingBag(true);
        builder.setPlastron(true);
        builder.setBodyCord(true);
        return builder.build();
    }
    public FencingEquipmentSet createSabreSet(){
        FencingEquipmentBuilder builder = new FencingEquipmentBuilder();
        builder.setWeaponType("Sabre");
        builder.setMask("Sabre Mask");
        builder.setJacketSize("M");
        builder.setGloveSize("M");
        builder.setHand("Right");
        builder.setChestProtector(true);
        builder.setFencingBag(true);
        builder.setPlastron(true);
        builder.setBodyCord(true);
        return builder.build();
    }
}
