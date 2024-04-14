//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072
public class Toshiba implements Laptop {

    private int volume;
    private boolean isPowerOn;

    public Toshiba() {
        this.volume = 30;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Laptop is On");
        System.out.println("Toshiba Satellite");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Shutdown is in process ...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOL) {
                System.out.println("Volume is Full");
            } else {
                this.volume += 10;
                System.out.println("Volume is: " + this.volume);
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOL) {
                System.out.println("Volume is 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume is: " + this.volume);
            }
        }
    }
}
