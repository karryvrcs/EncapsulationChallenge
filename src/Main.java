
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(true);
        System.out.println(printer.addToner(20));
        System.out.println(printer.printPages(5));
        System.out.println(printer.printPages(20));

        System.out.println(printer.addToner(90));
    }
}

class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(boolean duplex){
        this.duplex = duplex;
        tonerLevel = 0;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        tonerLevel = tonerLevel + tonerAmount;
        if (tonerLevel < 0 || tonerLevel > 100){
            return -1;
        } else {
            return tonerLevel;
        }

    }

    public int printPages (int pages){


        if (duplex){
            System.out.println("duplex printer!");
            if (pages%2 == 1){
                pagesPrinted += (pages + 1)/2;
                System.out.println("pagesPrinted: " + pagesPrinted);
                return (pages + 1)/2;

            } else {
                pagesPrinted +=  pages / 2;
                System.out.println("pagesPrinted: " + pagesPrinted);
                return pages / 2;
            }
        } else {
            pagesPrinted +=  pages;
            System.out.println("pagesPrinted: " + pagesPrinted);
            return pages;
        }

    }
}