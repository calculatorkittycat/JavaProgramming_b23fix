package day_54_recap;

import java.time.LocalDate;

public final class Encapsulation {

    private String bookName;

    private final LocalDate publishedDate = LocalDate.of(1998,5,28);

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        if(bookName.isEmpty()){
            throw new RuntimeException("Book is empty, book string can not be empty");
        }
        this.bookName = bookName;
    }

    public LocalDate getPublishedDate(){
        return publishedDate;
    }

    static String s1 = "text";


    //public void setPublishedDate(LocalDate publishedDate){
    //    this.publishedDate=publishedDate;
    //}

    public static void main(String[] args){
        String s2 = "";
        s1 = s2;
    }

    public Encapsulation(){

    }


}


class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setBookName("");
        System.out.println(obj.getBookName());


    }
}