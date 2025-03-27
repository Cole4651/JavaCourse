public class MagicSquare {
    int[][] array;

    public MagicSquare(int[][] array) {
        this.array = array;
    }

    public boolean rows() {
        int sum = 0;

        for(int r = 0; r < 3; r++){
            int temp = 0;
            for(int c = 0; c <3; c++) {
                temp += array[r][c];
            }
            if(r == 0) {
                sum = temp;
            } else {
                if(temp != sum) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean columns() {
        int sum = 0;

        for(int c = 0; c < 3; c++){
            int temp = 0;
            for(int r = 0; r <3; r++) {
                temp += array[r][c];
            }
            if(c == 0) {
                sum = temp;
            } else {
                if(temp != sum) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean diagnols() {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < 3; i++) {
            sum1 += array[i][i];
        }
        for(int i = 2; i >= 0; i--) {
            sum2 += array[i][i];
        }
        return sum1 == sum2;

    }


}
