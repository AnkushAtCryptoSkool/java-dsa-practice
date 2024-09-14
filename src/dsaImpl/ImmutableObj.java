package dsaImpl;

public final class ImmutableObj {
    private final String name;
    private final Integer data;
    public ImmutableObj(String name,Integer data){
        this.name = name;
        this.data = data;
    }
    public String getName(){
        return name;
    }
    public Integer getInteger(){
        return data;
    }

    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj("Ankush",2);
        System.out.println(immutableObj.data);
    }
}
