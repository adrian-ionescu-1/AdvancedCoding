package exercises.exercise8;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        return validateSum(parcel.getxLength(), parcel.getyLength(), parcel.getzLength()) &&
                validateDimension(parcel.getxLength(), parcel.getyLength(), parcel.getzLength()) &&
                validateWeight(parcel.getWeight(), parcel.isExpress());
    }

    public boolean validateSum(int x, int y, int z) {
        if (x + y + z < 300) {
            return true;
        } else {
            System.out.println("Sum is more than 300");
            return false;
        }
    }

    // TODO: 10/21/2023 inform which one is under 30
    private boolean validateDimension(int x, int y, int z) {
        if (x > 30 && y > 30 && z > 30) {
            return true;
        } else {
            System.out.println("At least one dim is under 30");
            return false;
        }
    }

    private boolean validateDimension2(int x, int y, int z) {
        boolean isValid = true;
        if (x < 30) {
            System.out.println("XLenght is less than 30");
            isValid = false;
        } if (y < 30) {
            System.out.println("YLenght is less than 30");
            isValid = false;
        } if (z < 30) {
            System.out.println("ZLenght is less than 30");
            isValid = false;
        }
        return false;
    }

    private boolean validateWeight(float weight, boolean isExpress) {
        if (!isExpress && weight < 30) {
            return true;
        } else if (isExpress && weight < 15) {
            return true;
        } else {
            System.out.println("It's to heavy");
            return false;
        }
    }
}
