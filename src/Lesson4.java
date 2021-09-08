public class Lesson4 {
    public static void main(String[] args) {
        int a=10;
        while(a!=0) {
            if (a % 2 == 0)
                System.out.print(a + " ");
            a--;
        }
        System.out.println();
        do{
            if (a % 2 ==-1)
                System.out.print(a + " ");
            a--;
        }while(a!=-10);
        System.out.println();
        for (int i = 1; ; i++) {
            if(i%2==0) continue;
            System.out.print(i+" ");
            if(i>10)
                break;
        }
    }
}
