package mapAndTree;

public class DeQuy {
    //5i=> 1*2*3*4*5

    public static int demoDeQuy(int i) {
        if (i == 0) {
            return 1;
        }
        return i * demoDeQuy(i - 1);
    }
    // 5*demoDeQuy(i-1)
    // 5*4*demoDeQuy(i-1)
    // 5*4*3*2*1*demoDeQuy(0)
    // 5*4*3*2*1*1

    public static void demoDeQuy2(int i) {
        if (i == 0) {
            return;
        }
        if (i % 3 == 0) {
            System.out.println(i);
            demoDeQuy2(--i);
        } else demoDeQuy2(i-1);


    }


    public static void main(String[] args) {
       demoDeQuy2(20);
    }
}
