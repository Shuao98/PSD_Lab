public class java_exer1_task5 {
    public static void main(String[] args) {
        Monster fire = new FireMonster(120, 30);
        Monster water = new WaterMonster(150, 25);
        Monster electric = new ElectricMonster(110, 35);

        System.out.println("=== Before Battle ===");
        System.out.println(fire);
        System.out.println(water);
        System.out.println(electric);
        System.out.println();

        // Fire attacks Water (Water dodges because HP ≥ 100)
        fire.attack(water);
        System.out.println(fire);
        System.out.println(water);

        // Water attacks Fire (Fire might dodge alternatively)
        water.attack(fire);
        System.out.println(fire);
        System.out.println(water);

        // Electric attacks Fire (Fire dodge alternates)
        electric.attack(fire);
        System.out.println(fire);
        System.out.println(electric);
    }
}
