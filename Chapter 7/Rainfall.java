public class Rainfall {
    private double[] rain;

    public Rainfall(){
        rain = new double[12];
    }

    public void addMonth(double rainfall, int month) {
        rain[month] = rainfall;
    }

    public double totalRainfall() {
        double total = 0;

        for(int i = 0; i < 12; i++) {
            total += rain[i];
        }

        return total;
    }

    public double average() {
        double total = 0;

        for(int i = 0; i < 12; i++) {
            total += rain[i];
        }

        total *= 100.0;
        return Math.round(total / 12.0) / 100.0;
    }

    public int getMostRain() {
        int index = 0;
        for(int i = 0; i < 12; i++) {
            if(rain[i] > rain[index]) {
                index = i;
            }
        }
        return index + 1;
    }

    public int getLeastRain() {
        int index = 0;
        for(int i = 0; i < 12; i++) {
            if(rain[i] < rain[index]) {
                index = i;
            }
        }
        return index + 1;
    }

}