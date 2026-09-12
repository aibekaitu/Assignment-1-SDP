public class Main {
    public static void main(String[] args) {
        FencingEquipmentDirector director = new FencingEquipmentDirector();
        FencingEquipmentSet foilSet = director.createFoilSet();
        FencingEquipmentSet sabreSet = director.createSabreSet();
        FencingEquipmentSet epeeSet = director.createEpeeSet();
        System.out.println(foilSet);
        System.out.println(sabreSet);
        System.out.println(epeeSet);
    }
}