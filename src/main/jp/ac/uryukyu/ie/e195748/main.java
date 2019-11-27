package jp.ac.uryukyu.ie.e195748;

public class main {
    public static void main(String[] args){
        try {
            String str = null;
            System.out.print(str.length());
        } catch (NullPointerException n){
            System.out.println("ぬるぽが発生しました");
            System.out.println(n.getMessage());
        }
    }
}
