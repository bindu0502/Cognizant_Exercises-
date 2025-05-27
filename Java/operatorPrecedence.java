class operatorPrecedenceDemo {
    public static void main(String[] args) {
        int res1 = 10 + 5 * 2;
        int res2 = (10 + 5) * 2;
        int res3 = 20 - 8 / 2 + 3;
        int res4 = 20 - (8 / (2 + 2)) + 3;

        // Displaying results
        System.out.println("Result-1 (10 + 5 * 2): " + res1);//(10+10)->20
        System.out.println("Result-2 ((10 + 5) * 2): " + res2);//((15)*2)->30
        System.out.println("Result-3 (20 - 8 / 2 + 3): " + res3);//(20-4+3)->(16+3)->19
        System.out.println("Result-4 (20 - (8 / (2 + 2)) + 3): " + res4);//(20-(8/(4))+3)->(20-(2)+3)->(18+3)->21
    }
}
