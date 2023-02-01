package Main;

public class matrizDeLista {
    ArrayList<ArrayList<Integer>> matrizList = new ArrayList();

        for (int i = 0; i < 5; i++) {
        matrizList.add(new ArrayList<Integer>());
    }

        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            matrizList.get(j).add(i);
        }
    }

        for(ArrayList<Integer> lista : matrizList){
        Collections.shuffle(lista);
    }

        for (ArrayList<Integer> lista : matrizList) {
        for (Integer num : lista) {
            System.out.print("|" + num + "|");
        }
        System.out.println();
    }
}
