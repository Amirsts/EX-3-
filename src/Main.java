public class Main {
    public static void main(String[] args) {
        // 1. ایجاد محیط‌های زیستی
        Habitat jungle = new Habitat("jungle", 25.5);
        Habitat ice = new Habitat("pole", -15.0);
        Habitat desert = new Habitat("desert", 40.0);

        // 2. ایجاد حیوانات
        Animal elephant = new Mammal("elephant", 12, jungle, false);
        Animal penguin = new Bird("penguin", 4, ice, 0.8);
        Animal snake = new Reptile("snake", 3, desert, true);

        // 3. ایجاد نگهبان و اختصاص حیوانات
        Zookeeper ali = new Zookeeper("Ali");
        ali.assignAnimal(elephant);
        ali.assignAnimal(penguin);
        ali.assignAnimal(snake);

        // 4. نمایش پروفایل حیوانات
        ali.showAnimalProfiles();

        // 5. غذا دادن به حیوانات
        ali.feedAnimals();
    }
}