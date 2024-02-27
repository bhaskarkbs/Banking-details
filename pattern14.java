public class pattern14 {
    public static void main(String[] args) {
        char n='A';
        for( char r='A';r<='D';r++){
            for(char c='A';c<=r;c++){
                System.out.print(n+++ " ");
            }
            System.out.println();
        }
    }
}
