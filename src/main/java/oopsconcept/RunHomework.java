package oopsconcept;

public class RunHomework {
    public static void main(String[] args) {
        System.out.println("Jay Mobile Store");
        Smartphone c = new Smartphone();
        c.introDuction();

        System.out.println("Most popular brand for iOS lovers - Apple.");
        Apple b = new Apple();
        b.networkSupport();
        b.storageCapacity();
        b.screenSize();
        b.screenTechnology();
        b.batteryCapacity();
        b.supportOfCharging();

        System.out.println("Most popular brand for Android lovers - Samsung.");
        Samsung a = new Samsung();
        a.networkSupport();
        a.storageCapacity();
        a.screenSize();
        a.screenTechnology();
        a.batteryCapacity();
        a.supportOfCharging();

        System.out.println("Most popular brand for budget smartphones - Oneplus.");
        Oneplus h = new Oneplus();
        h.networkSupport();
        h.storageCapacity();
        h.screenSize();
        h.screenTechnology();
        h.batteryCapacity();
        h.supportOfCharging();

        System.out.println("Most popular brand for Elder peoples or parents - Nokia.");
        Nokia bi = new Nokia();
        bi.networkSupport();
        bi.batteryCapacity();
        bi.screenTechnology();
        bi.storageCapacity();
        bi.supportOfCharging();
    }
}