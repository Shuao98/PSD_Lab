//Task 4 Test Case
public class java_exer1_task4 {

    public static void main(String[] args) {
        String[] fireWeaknesses = { "Water", "Rock" };
        String[] waterWeaknesses = { "Electric", "Grass" };

        Monster fireMonster = new Monster("Fire", 100, 30, fireWeaknesses);
        Monster waterMonster = new Monster("Water", 120, 25, waterWeaknesses);

        System.out.println("Before battle:");
        System.out.println(fireMonster);
        System.out.println(waterMonster);

        // Fire attacks Water
        fireMonster.attack(waterMonster);

        System.out.println("\nAfter Fire attacks Water:");
        System.out.println(waterMonster);

        // Water attacks Fire
        waterMonster.attack(fireMonster);

        System.out.println("\nAfter Water attacks Fire:");
        System.out.println(fireMonster);

    }
}
