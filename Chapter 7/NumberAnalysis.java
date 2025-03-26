import java.util.ArrayList;

public class NumberAnalysis {
    ArrayList<Integer> array;

    public NumberAnalysis(ArrayList<Integer> array) {
        this.array = array;
    }


    public int getTotal() {
        int total = 0;
        for(int i = 0; i < array.size(); i++) {
            total += array.get(i);
        }

        return total;
    }

    public double getAverage() {
        double total = 0;
        for(int i = 0; i < array.size(); i++) {
            total += array.get(i);
        }
        double average = (total / array.size()) * 100;
        average = Math.round(average);

        return (average/100);
    }
    
    public int getHighest() {
        int highest = array.get(0);

        for(int i = 0; i < array.size(); i++) {
            if(highest < array.get(i)) {
                highest = array.get(i);
            }
        }
       return highest; 
    }

    public int getLowest() {
        int lowest = array.get(0);

        for(int i = 0; i < array.size(); i++) {
            if(lowest > array.get(i)) {
                lowest = array.get(i);
            }
        }
        return lowest;
    }
}
