package jp.ac.uryukyu.ie.e165730;
public class Main {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("文字列はnullです");
            e.printStackTrace();
            System.exit(1);
        }

    }
}
