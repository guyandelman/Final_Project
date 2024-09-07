package Final_Project;

public class Shelf {
    Book[] books = new Book[5];
    int amount;
    boolean isShelfFull = false;

    Shelf(){
        amount=0;
    }

    public void setBooks(Book book){
        if (this.amount<5){
            this.books[this.amount]=book;
            this.amount++;
        } else {
            System.out.println("Shelf is full");
            isShelfFull=true;
        }

    }

    public void replaceBooks (int n,int m){
        Book book1;
        Book book2;
        int i = n-1;
        int j = m-1;

        if(i<=this.amount && j<=this.amount){
            book1=this.books[i];
            book2=this.books[j];

            this.books[i]=book2;
            this.books[j]=book1;
        }else if (i>this.amount) {
            System.out.println("There is no book on index: " +i);
        } else {
            System.out.println("There is no book on index: " +j);
        }

    }


}
