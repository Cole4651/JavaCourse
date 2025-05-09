public class SeatingChart {
    String[][] seatingChart;
    int columns;

    public SeatingChart(int rows, int columns) {
        seatingChart = new String[rows][columns];
        this.columns = columns;
    }

    public void addStudent(String name, int row, int column){
        seatingChart[row][column] = name;
    }

    public boolean isAvailable(int row, int column) {
        return seatingChart[row][column] == null;
    }

    public String getStudent(int row, int column) {
        return seatingChart[row][column];
    }

    public int getMaxWidth(){
        int max = 0;
        for(String[] row : seatingChart) {
            for(String name : row) {
                if(name != null && name.length() > max) {
                    max = name.length();
                }
            }
        }
        return max;
    }
}
