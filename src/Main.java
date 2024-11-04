

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] weights = {69, 73, 71, 70};
        //Задача 2
        for (int index = 0; index < numbers.length ; index++) {
            if (index == numbers.length - 1){
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] +", ");
        }
        for (int index = 0; index < fractional.length ; index++) {
            if (index == fractional.length - 1){
                System.out.println(fractional[index]);
                break;
            }
            System.out.print(fractional[index] +", ");
        }
        for (int index = 0; index < weights.length ; index++) {
            if (index == weights.length - 1){
                System.out.println(weights[index]);
                break;
            }
            System.out.print(weights[index] +", ");
        }
        //Задача 3
        for (int index = numbers.length - 1; index >= 0 ; index--) {
            if (index == 0){
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] +", ");
        }
        for (int index = fractional.length - 1; index >= 0 ; index--) {
            if (index == 0){
                System.out.println(fractional[index]);
                break;
            }
            System.out.print(fractional[index] +", ");
        }
        for (int index = weights.length - 1; index >= 0 ; index--) {
            if (index == 0){
                System.out.println(weights[index]);
                break;
            }
            System.out.print(weights[index] +", ");
        }
        //Задача 4
        for (int index = 0; index <numbers.length ; index++) {
            if (numbers[index] % 2 !=0){
                numbers[index]++;
            }
            if (index == numbers.length - 1){
                System.out.print(numbers[index]);
                break;
            }
            System.out.print(numbers[index] +", ");
        }
    }
}