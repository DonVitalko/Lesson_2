import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        zeroInOne();
        multiplyThree();
        lessSix();
        fillDiagonal();
        lessAndMore();
        int[] balance = {6, 4, 2, 4, 8, 2};
        System.out.println("Задание №6: " + hasBalance(balance));
        int[] twist = {2, 8, 1, 5, 9};
        twistMethod(twist);
    }

    static int zeroInOne(){
        int[] zeroOne={0,1,0,0,0,1,1,1,0,1,0};
        System.out.println("Задание №1: Заданный массив " + Arrays.toString(zeroOne));
        int i;
        for(i=0; i<zeroOne.length; i++){
            if(zeroOne[i] == 0){
                zeroOne[i]=1;
            }else {
                zeroOne[i] = 0;
            }
        }
        System.out.println("Меняем единицы на нули и нули на единицы " + Arrays.toString(zeroOne));
        System.out.println();
        return 0;
    }
    static int multiplyThree() {
        int i, j;
        int[] arr = new int[8];
        for (i = 0, j=0; i < arr.length; i++, j+=3) {
            arr[i]=j;
        }
        System.out.println("Задание №2: Умножить каждое последующие число на три." + Arrays.toString(arr));
        System.out.println();
        return 0;
    }
    static int lessSix(){
        int i;
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println("Задание №3: заданный массив " + Arrays.toString(arr));
        for(i=0; i< arr.length; i++){
            if(arr[i]<6){
                arr[i]=arr[i]*2;
            }
        }
        System.out.println("Числа менее 6 умножаются на 2 " + Arrays.toString(arr));
        System.out.println();
        return 0;
    }
    static int fillDiagonal() {
        int i, j;
        int[][] table = new int[5][5];
        for (i = 0; i < table.length; i++) {
            for (j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][table[j].length - 1 - i] = 1;
                }
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        return 0;
    }
    static int lessAndMore(){
        int x, max=0, min=100;
        int[] minMax = {10, 32, 5, 8, 2, 9, 50, 4};
        System.out.println("Задание №6: Заданый массив " + Arrays.toString(minMax));
        for (x=0; x< minMax.length; x++){
            if (minMax[x]>=max){
                max=minMax[x];
            }
            else if (minMax[x]<=min){
                min=minMax[x];
            }
        }
        System.out.println("Самое малое число = " + min);
        System.out.println("Самое большое число = " + max);
        System.out.println();
        return 0;
    }
    static boolean hasBalance(int[] balance) {
        int x, y;
        int resLeft = 0;
        for (x = 0; x < balance.length; x++) {
            resLeft += balance[x];

           int resRight = 0;
            for (y = 0; y < balance.length; y++) {
                resRight += balance[y];
            }
            if (resLeft == resRight) {
                System.out.println();
                return (true);
            }
        }
        System.out.println();
        return (false);
    }
    static int twistMethod(int[] twist){
        System.out.println("Задание №7: первоночальный массив "+ Arrays.toString(twist));
            int n = -2, x;
            if (n > 0) {
                for (x = 0; x < n; x++) {
                    twistNumberRight(twist);
                }
                System.out.println("Смещаем влево " + Arrays.toString(twist));
            } else if (n < 0) {
                for (x = n; x < 0; x++) {
                    twistNumberLeft(twist);

                }
                System.out.println("Смещаем вправо " + Arrays.toString(twist));
            }
        return 0;
    }
            static void twistNumberRight(int[] twist){
            int x, buffer = twist[0];
            twist[0]=twist[twist.length-1];
            for(x=1; x<(twist.length-1); x++){
                twist[twist.length - x]= twist[twist.length - x -1];
            }
                twist[1]= buffer;
            }
            static int twistNumberLeft(int[] twist){
            int x, buffer = twist[twist.length-1];
            twist[twist.length-1]=twist[0];
            for(x=(twist.length-1); x>0; x--){
                twist[x]=twist[x-1];
            }
                twist[0]=buffer;
            return twist[x];
            }
        }

