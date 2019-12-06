package Documents.java.practiseWork.CountFactors;

public class Solution {
 public int CountFactorsSolution(int N){
     int factors = 0;
     int squareRootNumber = (int) Math.sqrt(N);
     if (Math.pow(squareRootNumber, 2) != N){
         squareRootNumber++;
     }
     else {
         factors++;
     }
     for (int i=1; i<squareRootNumber; i++){
         if(N % i == 0){
             factors += 2;
         }
     }
     return factors;
 }
}
