public class MonthDays {

    private int month;
    private int year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getNumberOfDays() {

        switch (month) {
            case 11, 4, 6, 9 -> {
                return 30;
            }
            case 2 -> {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        return 29;
                    }
                } else {
                    if(year % 4 == 0){
                        return 29;
                    }
                }
                return 28;
            }
            default -> {
                return 31;
            }
        }
    }
}
