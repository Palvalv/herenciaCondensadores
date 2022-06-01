package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CondensadorElectrolitico c1 = new CondensadorElectrolitico(12, "DFS09G3U");
        CondensadorElectrolitico c2 = new CondensadorElectrolitico(2, "P48GKR04");
        CondensadorElectrolitico c3 = new CondensadorElectrolitico(120, "1JD85KEL");
        CondensadorElectrolitico[] arrCondensandor = {c1, c2, c3};
        Arrays.sort(arrCondensandor);
        System.out.println(arrCondensandor[0]);
        System.out.println(arrCondensandor[1]);
        System.out.println(arrCondensandor[2]);
    }
}
