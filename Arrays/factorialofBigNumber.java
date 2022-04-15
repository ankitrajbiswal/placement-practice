class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
         ArrayList<Integer> arrayList = new ArrayList<>();

       java.math.BigInteger num = new java.math.BigInteger("1");

       for (int i = 2; i <= N; i++) {
           num = num.multiply(java.math.BigInteger.valueOf(i));
       }

       char[] charArray = num.toString().toCharArray();

       for (char c : charArray) {
           int i = Integer.parseInt(String.valueOf(c));
           arrayList.add(i);
       }

       return arrayList;
    }
}
