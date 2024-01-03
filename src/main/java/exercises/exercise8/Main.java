package exercises.exercise8;

public class Main {
    public static void main(String[] args) {

        Parcel parcel1 = new Parcel(40, 50, 70, 25, false);
        Parcel parcel2 = new Parcel(110, 120, 130, 25, false);
        Parcel parcel3 = new Parcel(40, 50, 70, 35, false);
        Parcel parcel4 = new Parcel(20, 50, 70, 25, false);
        Parcel parcel5 = new Parcel(10, 20, 25, 25, false);

        ParcelValidator parcelValidator = new ParcelValidator();
        Validator validator = new ParcelValidator();

        System.out.println(parcelValidator.validate(parcel1));
        System.out.println(parcelValidator.validate(parcel2));
        System.out.println(parcelValidator.validate(parcel3));
        System.out.println(parcelValidator.validate(parcel4));
        System.out.println(parcelValidator.validate(parcel5));
    }
}
