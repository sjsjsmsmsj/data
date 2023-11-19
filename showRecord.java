import data.*;

public class showRecord {
    public static void main(String[] args) {
        racingBoys();
    }
    public static void racingBoys() {
        Dog d1 = new Dog("Nguyễn Văn Chiến", 2005, 46);
        Pet d2 = new Dog("Huỳnh Thái Lực", 2005, 54);
        DeathRace d3 = new Dog("Đoàn Trung Phát", 2005, 87);

        Motor m1 = new Motor("Exciter", "150 cm3", "77G1 - 2345");
        DeathRace m2 = new Motor("Winer", "150 cm3", "77G1 - 9999");
        
        DeathRace box[] = new DeathRace[] {d1, (Dog)d2, d3, m1, m2};
        for (DeathRace x : box) {
            x.showHowToDeath();
        }
    }
}
