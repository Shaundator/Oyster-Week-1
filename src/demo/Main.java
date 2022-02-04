package demo;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        int rotateAmount = 4;
        printArray(rotateArray(array,rotateAmount));
    }
    public static int[] rotateArray(int[] list, int amount) {
        if (list.length % amount == 0) {
            return rotation2(list,amount);
        } else {
            return rotation1(list, amount);
        }
    }
    public static int[] rotation1(int[] list, int amount){
        int temp1 = list[0];
        int temp2;
        int next = amount;
        for(int i = 0; i < list.length+1; i++){
            temp2 = list[next];
            list[next] = temp1;
            temp1 = temp2;
            next += amount;
            while(next >= list.length){
                next -= list.length;
            }
        }
        return list;
    }
    public static int[] rotation2(int[] list, int amount){
        int[] temp = new int[amount];
        int temp1;
        int temp2;
        for(int i = 0; i < amount; i++){
            temp[i] = list[i];
        }
        for(int i = 0; i < amount; i++){
            temp1 = temp[i];
            int next = i+amount;
            for(int j = 0; j < list.length/amount; j++){
                while(next >= list.length){
                    next -= list.length;
                }
                temp2 = list[next];
                list[next] = temp1;
                temp1 = temp2;
                next += amount;
            }
        }
        return list;
    }
    public static void printArray(int[] list){
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
