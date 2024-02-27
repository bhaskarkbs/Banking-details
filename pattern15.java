public class pattern15 {
    public static void main(String[] args) {
        for(int r=1;r<=5;r++){
            for(int c=1;c<=5;c++){
                if((c==1 ||c==4&&(r>1 && r<=3)||c==4 && r>4 &&r<=6)||r==4 && c==3||r==1 && (c<4) ||r==7 && (c<4)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
