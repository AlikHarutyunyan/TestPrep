import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,6,5,1};
    }


    //להפוך מערך בלי לשנות את המערך המקורי
    public static int[] reverseArray(int[] arr){
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length-(i+1)];
        }
        return reversedArr;
    }


    //להפוך מערך עם לשנות את המערך המקורי
    public static void reverseArr(int[] arr){
        int middle = arr.length/2;
        for (int i = 0,  j = arr.length-1; i < middle; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    //להפוך מחרוזת
    public static String reverseString(String text){
        String reversed = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }


    //להפוך מספר
    public static int reverseInt(int num){
        int rev = 0;
        while(num > 0){
            int digit = num%10;
            num /= 10;
            rev = rev * 10 + digit;
        }

        return rev;
    }


    //לסדר את המערך בסדר עולה (אפשר להחליף את הסימן < ל > ויהיה סדר יורד)
    public static void sortArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    //למחוק מספרים במערך שחוזרים לעצמם
    public static int[] removeDuplicates(int[] arr){
        String uniqueItems = "";

        for (int i = 0; i < arr.length; i++) {
            if(!uniqueItems.contains(arr[i]+"")){
                uniqueItems += arr[i];
            }
        }

        int[] uniqueArr = new int[uniqueItems.length()];
        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = uniqueItems.charAt(i) - '0';
        }

        return uniqueArr;
    }

    //לספור אותיות גדולות
    public static int countUpperCases(String text){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(Character.isUpperCase(text.charAt(i))){
                count++;
            }
        }
        return count;
    }


    //להוסיף למערך
    public static int[] addToArray(int[] arr,int item){
        int[] biggerArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            biggerArr[i] = arr[i];
        }
        biggerArr[biggerArr.length-1] = item;

        return biggerArr;
    }


    //להסיר ממערך
    public static int[] removeFromArray(int[] arr,int index){
        int[] smallerArr = new int[arr.length-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(i != index){
                smallerArr[j] = arr[i];
                j++;
            }
        }

        return smallerArr;
    }


    // ליצור עותק של מערך
    public static int[] copyArr(int[] arr){
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }

        return copyArr;
    }


    //סכום ספרות של המספר
    public static int sumDigits(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            num /= 10;
            sum += digit;
        }

        return sum;
    }


    //לחלץ מספר הכי גדול במערך
    public static int getHighestNum(int[] arr){
        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(highest < arr[i]){
                highest = arr[i];
            }
        }

        return highest;
    }

}
