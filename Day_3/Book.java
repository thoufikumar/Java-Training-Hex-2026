package Day_3;

public class Book {
    int id;
    String name;
    String address;

    public Book(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override 
    public String toString(){
        return "Book{"+"id="+id+",name='"+name + '\''+ ",address='" + address + '\'' + '}';
    }
}
