public class ChachaJi {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("run" + i);
            }
        };
        Thread th = new Thread(runnable);
        th.run();
        dosmoe();
    }
        private static void dosmoe(){
//        int  a = 100;
        Empolye em = ()->{
            int  a = 200;
            System.out.println(a);
          };
        }
}
