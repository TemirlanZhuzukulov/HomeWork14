public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("Temirlan","Java","peaksoft");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("===========================");
        Dancer dancer=new Dancer("Adam","prof","famous");
        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("================================");
        Singer singer=new Singer("Mirbek","C#","JYLDYZ");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.walk();
        singer.eat();

    }
}