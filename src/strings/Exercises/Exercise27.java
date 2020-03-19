package strings.Exercises;

import java.util.Scanner;
public class Exercise27 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a genome String: ");
        String s = sc.nextLine();
        String[] resArray = getGenes(s);
        int tempCounter = 0;
        for(String str : resArray){
            if(str != null){
                System.out.println(str);
            }else{
            tempCounter++;
            }
        }
        if(tempCounter == resArray.length)System.out.println("No gene is found");
        sc.close();
    }
// TGTGTGTATAT
// TTATGTTTTAAGGATGGGGCGTTAGTT
    public static String[] getGenes(String genomeSeq){
        int beg = -1;
        String[] arr = new String[genomeSeq.length()];
        final String start = "ATG";
        final String stop1 = "TAG";
        final String stop2 = "TAA";
        final String stop3 = "TGA";
        for(int i = 0,k=0; i < genomeSeq.length() - 2; i++, k++){
            String geneSample = genomeSeq.substring(i, i+3);
            if(geneSample.equals(start))beg = i;
            if((beg != -1) && ((geneSample.equals(stop1)) || (geneSample.equals(stop2)) || (geneSample.equals(stop3)))
                    && (beg + 3) < i){
                if(genomeSeq.substring(beg + 3, i).length() % 3 == 0){
                    //System.out.println(genomeSeq.substring(beg + 3, i));
                    arr[k] = genomeSeq.substring(beg + 3, i);
                    beg = -1;
                }
            }
        }
        return arr;
    }
}
