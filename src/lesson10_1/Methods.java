package lesson10_1;

public class Methods {

    public static void twoNumberBlocks (String numberDocument) {
        String block[] = numberDocument.split("-");
        System.out.println(block [0]+block [2]);
    }
    public static void numberDocument (String numberDocument) {
        StringBuilder numberDocument1 = new StringBuilder(numberDocument);
        numberDocument1.replace(5,8,"***");
        numberDocument1.replace(14,17,"***");
        System.out.println(numberDocument1);
    }
    public static void onlySmallabs (String numberDocument) {
        String block[] = numberDocument.split("-");
        System.out.println(block[1].toLowerCase() + "/" + block[3].toLowerCase() +
                "/" + numberDocument.toLowerCase().charAt(19) +
                "/" + numberDocument.toLowerCase().charAt(21));
    }
    public static void onlyHightABC (String numberDocument) {
        StringBuilder numberDocument1 = new StringBuilder(numberDocument);
        System.out.println("Letters: " + numberDocument1.substring(5,8).toUpperCase()+
                "/" + numberDocument1.substring(14,17).toUpperCase() +
                "/" + numberDocument1.substring(19,20).toUpperCase() +
                "/" + numberDocument1.substring(21,22).toUpperCase());
    }
    public static void abcSearch (String numberDocument) {
        String c = numberDocument.toLowerCase();
        if (c.contains("ABC") || c.contains("abc")) {
            System.out.println("true");
        } else { System.out.println("false");
        }
    }
    public static void start (String numberDocument) {
        String c = numberDocument;
        if (c.startsWith("555")) {
            System.out.println("Yes");
        } else { System.out.println("No");
        }
    }
    public static void end (String numberDocument) {
        String c = numberDocument;
        if (c.endsWith("1a2b")) {
            System.out.println("Yes");
        } else { System.out.println("No");
        }
    }
}

