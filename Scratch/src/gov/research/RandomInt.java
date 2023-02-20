package gov.research;

class RandomInt {
    public static void main(String[] args) {
        int[] Rands = new int[1000];
        for (int i = 0; i < 1000; i++) {
            Rands[i] = (int) (Math.random() * 20) + 1;
        }

        for (int i = 1; i < 21; i++) {
            int count = 0;
            for(int x: Rands) {
                if(x == i) {
                    count++;
                }
            }
            System.out.println(i + " was generated " + count + " times.");
        }
    }
}