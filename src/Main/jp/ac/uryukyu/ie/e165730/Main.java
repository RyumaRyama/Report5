package jp.ac.uryukyu.ie.e165730;
public class Main {
    public static void main(String[] args) {
        String str = "3．14";
        double value;
        try {
            value = Double.parseDouble(str);
        }
        catch (NullPointerException e) {
            System.out.println("文字列はnullです");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
