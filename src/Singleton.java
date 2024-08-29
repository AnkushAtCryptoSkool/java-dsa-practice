public class Singleton {

    private static  Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstace(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstace();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstace();
        System.out.println(s2);
    }
}
