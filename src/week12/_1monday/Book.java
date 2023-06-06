package week12._1monday;

import java.util.HashMap;
import java.util.Map;

public class Book {
    int id;
    String name,author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

   static class MapExample {
        public static void main(String[] args) {
            HashMap<Integer,Book>map=new HashMap<>();
            Book b1=new Book(101,"Let us C","Yashwant");
            Book b2=new Book(102,"Java","Ozgur");
            Book b3=new Book(103,"Testing","Burcu");
            map.put(1,b1);
            map.put(2,b2);
            map.put(3,b3);

            // Traversing map
            for (Map.Entry<Integer,Book> e:map.entrySet()){
                int key=e.getKey();
                Book b=e.getValue();
                System.out.println(key+"th. Book details");
                System.out.println(b.id+" "+b.name+" "+b.author);
            }
        }
    }
}
