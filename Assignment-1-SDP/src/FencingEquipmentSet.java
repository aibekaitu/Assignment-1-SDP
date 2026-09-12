public class FencingEquipmentSet {
    private String weaponType;
    private String mask;
    private String jacketSize;
    private String gloveSize;
    private String hand;
    private boolean chestProtector;
    private boolean plastron;
    private boolean bodyCord;
    private boolean fencingBag;
    public FencingEquipmentSet(
            String weaponType,
            String mask,
            String jacketSize,
            String gloveSize,
            String hand,
            boolean chestProtector,
            boolean plastron,
            boolean bodyCord,
            boolean fencingBag) {
        this.weaponType=weaponType;
        this.mask=mask;
        this.jacketSize=jacketSize;
        this.gloveSize=gloveSize;
        this.hand=hand;
        this.chestProtector=chestProtector;
        this.plastron=plastron;
        this.bodyCord=bodyCord;
        this.fencingBag=fencingBag;
    }

    @Override
    public String toString() {
        return "FencingEquipmentSet{" +
                "weaponType='" + weaponType + '\'' +
                ", mask='" + mask + '\'' +
                ", jacketSize='" + jacketSize + '\'' +
                ", gloveSize='" + gloveSize + '\'' +
                ", hand='" + hand + '\'' +
                ", chestProtector=" + chestProtector +
                ", plastron=" + plastron +
                ", bodyCord=" + bodyCord +
                ", fencingBag=" + fencingBag +
                '}';
    }
}
