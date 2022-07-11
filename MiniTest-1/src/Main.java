public class Main {
    public static void main(String[] args) {
        ProgrammingBook book1 = new ProgrammingBook(1,"Bae1",10,"HHa","Java",1);
        ProgrammingBook book2 = new ProgrammingBook(2,"Bae2",10,"HHa","Java",1);
        ProgrammingBook book3 = new ProgrammingBook(3,"Bae3",10,"HHa","Java",1);
        ProgrammingBook book4 = new ProgrammingBook(4,"Bae4",10,"HHa","Java1",1);
        ProgrammingBook book5 = new ProgrammingBook(5,"Bae5",10,"HHa","Java1",1);

        FictionBook book6 = new FictionBook(6,"Avenger1",10,"HHa","Viễn tưởng 1");
        FictionBook book7 = new FictionBook(7,"Avenger2",10,"HHa","Viễn tưởng 1");
        FictionBook book8 = new FictionBook(8,"Avenger3",10,"HHa","Viễn tưởng 2");
        FictionBook book9 = new FictionBook(9,"Doraemon1",10,"HHa","Viễn tưởng 2");
        FictionBook book10 = new FictionBook(10,"Doraemon2",1000,"HHa","Viễn tưởng 2");

        Book[] arr = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10};

        ProgrammingBook[] arr1 = {book1,book2,book3,book4,book5};

        FictionBook[] arr2 = {book6,book7,book8,book9,book10};


//        Tổng giá 10 cuốn sách
        System.out.println("Tong gia "+arr.length+" cuon sach la: "+ sumPrice(arr));


//        Số sách ProgrammingBook có language là "Java"
        System.out.println("So sach ProgrammingBook co language \"Java\" la: " + checkLanguage(arr1));

//        Số sách Fiction có category là “Viễn tưởng 1”
        System.out.println("So sach Fiction co category “Viễn tưởng 1” la: "+ checkCategory(arr2) );


//        Số sách Fiction có giá <100.
        System.out.println("so sach Fiction co gia <100 la: "+ checkPriceFiction(arr2));

    }

    public static int sumPrice(Book[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getPrice();
        }
        return sum;
    }

    public static int checkLanguage(ProgrammingBook[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLanguage() == "Java"){
                count++;
            }
        }
        return count;
    }

    public static int checkCategory(FictionBook[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getCategory() == "Viễn tưởng 1"){
                count++;
            }

        }
        return count;
    }

    public static int checkPriceFiction(FictionBook[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getPrice() < 100){
                count++;
            }
        }
        return count;
    }




}
