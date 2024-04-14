//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class LaptopUser {

    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOnLaptop() {
        this.laptop.powerOn();
    }

    public void turnOffLaptop() {
        this.laptop.powerOff();
    }

    public void makeLaptopLouder() {
        this.laptop.volumeUp();
    }

    public void makeLaptopSilence() {
        this.laptop.volumeDown();
    }
}
