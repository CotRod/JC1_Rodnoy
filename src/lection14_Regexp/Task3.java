package lection14_Regexp;

public class Task3 {
    public static void main(String[] args) {
        String s = "<p>wernmov emovk kvmik rkemvoki</p><p id=\"jrwennfwej\">krkrmkkmr mkemrvkme ekmfvkemrv kmkmerv</p>";
        System.out.println(s);
        s = s.replaceAll("<p(?!>).+?>", "<p>");
        System.out.println(s);
    }
}
