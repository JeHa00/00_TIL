public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("while문 버전");
        while (count < 11) {
            System.out.println(count);
            count++;
        }
        System.out.println();
        System.out.println("for 문 버전");
        for (int i = 1; i< 11; i++){
            System.out.println(i);
        }
    }
}
