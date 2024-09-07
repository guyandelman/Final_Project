package Final_Project;

import java.util.ArrayList;

public class Library extends Shelf {
    Shelf[] shelfs = new Shelf[3];
    ArrayList<Reader> readers = new ArrayList<>();

    public boolean isTherePlaceForNewBook() {
        boolean bool = true;
        for (int i = 0; i < 3; i++) {
            if (this.shelfs[i] == null) {
                bool = false;
                break;
            } else if (super.isShelfFull == false) {
                bool = false;
                break;
            } else bool = true;

        }
        return bool;
    }

    public void addNewBook(Book newBook) {
        for (int i = 0; i < 3; i++) {
            if (shelfs[i].isShelfFull == false) {

                super.setBooks(newBook);
            }
        }

    }

    public void deleteBook (String t){
        for (int i=0 ; i<3;i++) {
            for (int j = 0; j < 5; j++) {
                if (t==this.shelfs[i].books[j].title){
                    this.shelfs[i].books[j].title=null;

                }
            }
        }
    }

    public void registerReader (String newID,String newName){

        Reader r= new Reader(newID,newName);

        readers.add(r);
    }

    public void removeReader (String newName){
        Reader r= new Reader(newName);
        for (int i=0 ; i <this.readers.size();i++){
            r.name=newName;
            if(this.readers.get(i).name==r.name){
                this.readers.remove(i);
            }
        }
    }

    public String[] serchByAuthor (String aName){
        int count=0;
        String[] bookTitle = new String[count];
        for (int i=0 ; i<3;i++) {
            for (int j = 0; j < 5; j++) {
                if (aName==this.shelfs[i].books[j].author){
                     bookTitle[count]=this.shelfs[i].books[j].title;
                        System.out.println(bookTitle[count]);
                        count++;
                }
                
            }
        } return bookTitle;
    }
}
