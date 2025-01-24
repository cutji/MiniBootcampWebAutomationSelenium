package com.webautomation;

import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Data type and naming variable
        int count;
        var count1 = 3;
        int total = 6;

        String word = "aku";

        System.out.printf("Hasilnya, %s \n", word);
        System.out.printf("Hasilnya, %d \n", count1);


        int[][] twoDimensions;
        twoDimensions = new int[2][3];
        twoDimensions[0][0] = 5;
        twoDimensions[0][1] = 6;
        twoDimensions[0][2] = 10;

        System.out.println("Hasil value 2 dimensi" + Arrays.toString(twoDimensions));

        //Array
        // Nanti tunjukkan kalau tipe datanya beda
        int[] arrayInt;
        int[][] arrayInt1;

        arrayInt1 = new int[10][10];

        arrayInt1[1][2] = 10;
        arrayInt = new int[4];
        arrayInt[0] = 1;
        arrayInt[1] = 5;
        arrayInt[2] = 6;
        arrayInt[3] = 7;
        
        // Adress
        System.out.println(arrayInt);
        // Print value
        System.err.println(Arrays.toString(arrayInt));

        int[] arrayInt2 = {1,2,3,4,5};
        var arrayInt3 = new int[]{1,2,3,4,5};

        String[] strings1 = {"1","2","3","90"};


        //ArrayList
        /*
         * perbedaan ini dengan array,
         * Kalau di array kita perlu defenisikan jumlah/alocate memory berapa
         * sedangkan kalau di array list bisa lebih dynamic
         * Kemudian di array kita hanya bisa object dan primitive sedangkan di arraylist hanya object aja
         */

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("hasil dari arraylist" + fruits.get(0));

        ArrayList<Integer> collection = new ArrayList<>();

        collection.add(2);
        // Using Operators
        // Penjumlahan
        int schema, result;
        schema = 1 + 3;
        result = schema;

        System.out.printf("Hasil penjumlahan %d \n", result);

        // Pengurangan
        schema = 3 - 2;
        result = schema;

        System.out.printf("Hasil dari pengurangan %d \n", result);

        // Pembagian
        // Mod
        // Boolean
        Boolean isActive = false;
        System.out.printf("Hasil dari boolean %b \n", isActive);
        
        isActive = true;

        System.out.printf("Hasil dari booolena %b \n", isActive);


        // Basic function
        helloWorld();
        functionParams(2, "hello world");

        int[] tempValue;
        tempValue = returnValue(arrayInt);
        System.out.printf("hasil dari array %s ",returnValue(arrayInt));
        System.out.printf("hasil dari array %s ",Arrays.toString(tempValue));

        System.out.printf("hasil dari return string %s \n", returnString("Hallo"));
        System.out.printf("Hasil dari return boolean %b", returnBoolean());


        // Control flow statements
        /**
         * Program A dieksekusi kalau nilai nya adalah ganjil
         * Program B dieksekusi kalau nilai nya adalah genap
         */

        /*
         * Scenario If Then Statement
         * Contoh kalau true print sesuatu
         */
        applayIfStatement(false);

        /*
         * Scenario If Else  Statement
         * Contoh kalau true print sesuatu kalau else print else
         */
        System.out.printf("Hasil dari return statement adalah %s", applyIfElseStatement(true));

        loopingFor();
       
        /*
         * Nanti jelaskan tentang perbedaan while dan do-while
         */
       
        whileProgram(10);

        doWhileProgram(10);

        /*
         * Branching with switch statements
         */

        switchProgram(12);

        /*
         * Kasih combine looping dan if else dan break
         * Scenario jika sudah menemukan akan 2 break dan tidak lanjut lagi
         */

        combineMethod();


        /*
         * Object dan Class
         */
        // Constructor
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.brand);

        bicycle = new Bicycle(1,2,"Yamaha");

        System.out.println("Hasilnya" + bicycle.brand);

        bicycle.speedUp(10);

        bicycle.addGear(10);

        System.out.printf("Hasil penambahan speed %d , %d \n", bicycle.speed, bicycle.addGear(10));
 

        bicycle.printStates();


        // Ini tambahin demo arraylist object

        ArrayList<Bicycle>bicycle1 = new ArrayList<>();
        Bicycle bicycle2 = new Bicycle(1,2,"Yamaha");
        Bicycle bicycle3 = new Bicycle(1,2,"Yamaha");

        bicycle1.add(bicycle2);
        bicycle1.add(bicycle3);

        for (Bicycle bicycle4 : bicycle1) {
            System.out.println(bicycle4.speed);
        }
        
        // System.out.println("hasil bicycle \n" + bicycle1);


        

    }

    public static void helloWorld(){
        System.out.println("hello world");
    }

    public static void functionParams(int count, String ch){
        System.out.printf("Hasilya adalah ini %d dan %s \n", count, ch);
    }

    public static int[] returnValue(int[] inputArray){
        int[] array;

        array = inputArray;
        return array;
    }

    public static String returnString(String inputString){
        return inputString;
    }

    public static Boolean returnBoolean (){
        Boolean boolean1;
        boolean1 = true;
        return boolean1;
    }

    public static void applayIfStatement(Boolean boolean1){
        if (boolean1) {
            System.out.println("hasilnya adalah true");
        }
    }

    public static String applyIfElseStatement(Boolean boolean1){
        if (boolean1) {
            return "Ini adaalah true";
        }else{
            return "Ini adalah false";
        }
    }

    public static void loopingFor(){
        int i = 1;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void whileProgram(int inputInteger){
        int i = 2;
        while (i <= inputInteger) {
            System.out.printf("Hasilnya adalah %d \n",i);
            i++;
        }
    }

    public static void doWhileProgram(int inputInteger){
        int i = 0;
        do {
            System.out.printf("Hasil dowhile program adalah %d \n", i);
            i++;
        } while (i < inputInteger);
    }

    public static void switchProgram(int month){
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                break;
        }
    }

    public static void combineMethod(){
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.printf("Sudah ketemu nih %d \n",i);
                break;
            }else{
                System.out.printf("index %d \n",i);
            }
        }
    }
}
