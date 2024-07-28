package src;
public class Lab {
    public int calculateRentalFee(int h, int numPeople) {
        int total = 0;
        if (0 < numPeople && numPeople <= 15) {
            if(0 < h && h < 4) {
                total = h*450000;
            } else if(4 <= h && h <= 8) {
                total = (int) (Math.floor(h/4)*1600000 + (h - Math.floor(h/4)*4)*450000);
            } else {
                throw new InvalidInputException("Input is invalid: " + String.valueOf(h));
            }
        } else if (15 <= numPeople && numPeople <= 30) {
            if(0 < h && h < 4) {
                total = 2000000;
            } else if (4 <= h && h <= 8) {
                total = 3500000;
            } else {
                throw new InvalidInputException("Input is invalid: " + String.valueOf(h));
            }
        } else {
            throw new InvalidInputException("Input is invalid: " + String.valueOf(numPeople));
        }
        return total;
    }
} 
