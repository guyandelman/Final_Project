package Final_Project;

import java.util.ArrayList;

public class Reader extends Book{

    String id;

    String name;
    ArrayList<String> books = new ArrayList<>();

    public Reader(String i,String n){
        this.id=i;
        this.name=n;
    }
    public Reader(String n){

        this.name=n;
    }

    public void readBook (String t){

        for (int i=0 ; i< books.size() ; i++){
            if (t== super.title){
                books.set(i,t);
            }
        }



    }
}

