package newPack.collectionPractice;

public class Car {

    private String registrationNumber;

    public Car(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Car){
            String regNo = ((Car)obj).getRegistrationNumber();
            if(regNo != null && regNo.equals(this.registrationNumber)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.registrationNumber.hashCode();
    }

    @Override
    public String toString() {
        return this.registrationNumber;
    }
}
