package exercises.exercise7;

public class Gun {

    private int magazineSize;
    private boolean isLoaded;

    public Gun(int size) {
        this.magazineSize = size;
    }

    public void loadBullet() {
        if (magazineSize > 0 && !isLoaded) {
            isLoaded = true;
            magazineSize--;
        } else if (isLoaded) {
            System.out.println("The gun is already loaded");
        } else {
            System.out.println("size 0");
        }
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void shot() {
        if (isLoaded) {
            System.out.println("Shot");
            isLoaded = false;
        } else {
            System.out.println("The gun is not loaded");
        }
    }
}
