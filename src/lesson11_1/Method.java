package lesson11_1;

public class Method {

    public static void abcSearch(String numberDocument) throws abcException {
        String c = numberDocument.toLowerCase();
        if (c.contains("ABC") || c.contains("abc")) {
            throw new abcException();
        }
    }
        public static void start (String numberDocument) throws fiveException {
            String c = numberDocument;
            if (c.startsWith("555")) {
               throw new fiveException();
        }
    }
        public static void end (String numberDocument) throws oneaTwobException {
            String c = numberDocument;
            if (c.endsWith("1a2b")) {
                throw new oneaTwobException();
            }
        }
    }

