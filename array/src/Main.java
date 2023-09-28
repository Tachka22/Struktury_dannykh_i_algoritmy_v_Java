import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------
        System.out.println("Array:");
        int size = 9;
        highArray highArray = new highArray(size);
        highArray.Insert(99);
        highArray.Insert(44);
        highArray.Insert(55);
        highArray.Insert(22);
        highArray.Insert(88);
        highArray.Insert(11);
        highArray.Insert(0);
        highArray.Insert(66);
        highArray.Insert(33);
        highArray.Print();

        //if (highArray.Find(11)) System.out.println("Successfully");
        //else System.out.println("Can`t find");
        //highArray.Delete(11);

        //highArray.Print();
        //highArray.bubbleSort();
        //highArray.selectSort();
        highArray.insertSort();
        highArray.Print();

        //--------------------------------------------------------------------------

    }
    /**
     * /Слиянение двух массивов
     */
    public static void mergeArray(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC){
        int aDex = 0, bDex = 0, cDex = 0;
        while(aDex < sizeA && bDex < sizeB) //пока ни один из массивов не пуст
            if (arrayA[aDex] < arrayB[bDex])
                arrayC[cDex++] = arrayA[aDex++];
            else
                arrayC[cDex++] = arrayB[bDex];
        while (aDex < sizeA)
            arrayC[cDex++] = arrayA[aDex++];
        while (bDex < sizeB)
            arrayC[cDex++] = arrayB[bDex++];
    }
}