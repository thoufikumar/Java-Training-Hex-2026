package Day_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookMap {
    private static String[][] library = new String[100][100];
    static int numshelf =100;
    static int numLocPerShelf =100;

    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        Book b1= new Book(1,"Kafka on the Shore");
        Book b2= new Book(2,"The Great Gatsby");
        Book b3= new Book(3,"To Kill a Mockingbird"); 

        b1.address=hashAddress(b1);
        b2.address=hashAddress(b2);
        b3.address=hashAddress(b3);

        Map<Integer,Book> map=new HashMap<>();
        map.put(b1.id,b1);
        map.put(b2.id,b2);
        map.put(b3.id,b3);

        System.out.println("Enter the book id to search");
        int id=sc.nextInt();
        Book found=map.get(id);
        System.out.println(found);

}
private static String hashAddress(Book b){
    int shelfNo=(b.id%numshelf);
    for(int i=0;i<numLocPerShelf; i++){
        if(library[shelfNo][i]==null){
            library[shelfNo][i]="Book" + b.id;
            return b.id+"#"+"S"+ (shelfNo+1)+"#"+"L"+(i+1);
        }
    }
    return null;
}


}
