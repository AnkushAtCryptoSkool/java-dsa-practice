import java.io.*;

public class Java implements Serializable{
    private int c;
    private String v;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Java{" +
                "c=" + c +
                ", v='" + v + '\'' +
                '}';
    }

    public static void main(String[] args) {
        try {
            Class cls = Class.forName("Java");
            Java j = (Java) cls.newInstance();
            j.setC(1);
            j.setV("a");
            System.out.println(j);


            FileOutputStream f
                    = new FileOutputStream("file.txt");
            ObjectOutputStream oos
                    = new ObjectOutputStream(f);
            oos.writeObject(j);
            oos.close();
            f.close();

            FileInputStream f1 = new FileInputStream("file.txt");
            ObjectInputStream ios = new ObjectInputStream(f1);
            Java j1 = (Java) ios.readObject();
            System.out.println(j1);
             ios.close();
             f1.close();

            byte[] data = {(byte) 0xe0, 0x4f, (byte) 0xd0, 0x20, (byte) 0xea};
            OutputStream os = new FileOutputStream("data.bin");
            os.write(data);
            os.close();

            InputStream is = new FileInputStream("data.bin");
            byte[] newData = new byte[5];

            is.read(newData);
            is.close();

            for (byte b : newData) {
                System.out.print(b+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
