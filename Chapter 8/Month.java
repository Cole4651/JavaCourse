public class Month {
    int month;

    public Month() {
        System.out.println("Defaulting to 1. ");
        month = 1;
    }

    public Month(int month) {
        if(month < 1 || month > 12) {
            System.out.println("Invalid argument, defaulting to 1. ");
            this.month = 1;
        } else {
            this.month = month;
        }
    }

    public Month(String month) {
        switch (month) {
            case "January":
                this.month = 1;
                break;
            case "February":
                this.month = 2;
                break;
            case "March":
                this.month = 3;
                break;
            case "April":
                this.month = 4;
                break;
            case "May":
                this.month = 5;
                break;
            case "June":
                this.month = 6;
                break;
            case "July":
                this.month = 7;
                break;
            case "August":
                this.month = 8;
                break;
            case "September":
                this.month = 9;
                break;
            case "October":
                this.month = 10;
                break;
            case "November":
                this.month = 11;
                break;
            case "December":
                this.month = 12;
                break;
            default:
                System.out.println("Invalid argument defaulting to January");
                this.month = 1;
                break;
        }   
    }

    public void setMonthNumber(int month) {
        this.month = month;
    }

    public int getMonthNumber() {
        return month;
    }
    
    public String getMonthName() {
        switch (month) {
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 1 -> {
                return "January";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "Janurary";
            }
        }
        
    }

    @Override
    public String toString(){
        switch (month) {
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 1 -> {
                return "January";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "Janurary";
            }
        }
        
    }

    public boolean equals(Month month) {
        return month.getMonthNumber() == this.month;
    }

    public boolean greaterThan(Month month) {
        return month.getMonthNumber() < this.month;
    }

    public boolean lessThan(Month month) {
        return month.getMonthNumber() > this.month;
    }
}
