package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesSieve {
    List<Integer> primeList;
    int[] searchArray;

    public EratosthenesSieve() {}
    public EratosthenesSieve(int upperBound) {
        primeList = new ArrayList<>();
        searchArray = new int[upperBound];
    }

//    private int checkFirst() {
//        for(int num: searchArray) {
//            if(num != -1) return num;
//        }
//        return -1;
//    }
    public List<Integer> find() {
        for(int i = 2; i * i < searchArray.length; i++) {
            if (searchArray[i] == 0) {
                for (int j = i; i * j < searchArray.length; ++j) {
                    if (searchArray[i * j] == 0) searchArray[i * j] = i;
                }
            }
        }

        for(int i = 2; i < searchArray.length; i++) {
            if(searchArray[i] == 0) primeList.add(i);
        }
        return primeList;
//            int targetNum = searchArray[i];
//            if(targetNum != -1) {
//                primeList.add(targetNum);
//                for(int j = 0; j * targetNum < searchArray[searchArray.length-1]; j++) {
//                    int dividend = searchArray[j];
//                    if (dividend % targetNum == 0) {
//                        searchArray[j] = -1;
//                    }
//                }
//            }
//        }
//        primeList.addAll(new ArrayList(List.of(searchArray)));
//        return primeList;
    }
}
