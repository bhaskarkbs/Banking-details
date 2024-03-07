
    import java.util.Arrays; 
    import java.util.Scanner;
      
    public class twodarrayswitch1 {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int columns = sc.nextInt();
            int[][] Array1 = new int[rows][columns];
            int[][] Array2 = new int[rows][columns];
            int[][] Array3 = new int[rows][columns];
            if (rows !=0 && columns !=0) {
            System.out.println("Enter the First array values: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Array1[i][j] = sc.nextInt();
    
                }
            }
            System.out.println("First Array is:  ");
            for (int i = 0; i < Array1.length; i++) {
                System.out.println(Arrays.toString(Array1[i]));
            }
            System.out.println("Enter the second array values: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Array2[i][j] = sc.nextInt();
    
                }
            }
            System.out.println("Second Array is:  ");
            for (int i = 0; i < Array2.length; i++) {
                System.out.println(Arrays.toString(Array2[i]));
    
            }
            System.out.println("Enter the Third array values: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    Array3[i][j] = sc.nextInt();
    
                }
            }
            System.out.println("Third Array is:  ");
            for (int i = 0; i < Array3.length; i++) {
                System.out.println(Arrays.toString(Array3[i]));
            }
            System.out.println("enter the number: \n 1.Addition \n 2.subtraction\n 3.multiplication \n 4.divition ");
            int num = sc.nextInt();
            int a=0;
            switch (num) {
                case 1: {
    
                    int[][] sum = new int[rows][columns];
                    for (int i = 0; i < Array1.length; i++) {
                        for (int j = 0; j < Array1[i].length; j++) {
                            sum[i][j] = Array1[i][j] + Array2[i][j] + Array3[i][j];
                            if(sum[i][j]==0){
                                a++;
                            }
                        }

                    }
                    if(a==(rows*columns)){
                        System.out.println(" this is null array");

                    }
                    System.out.println("Sum of 2D array: ");
                    for (int i = 0; i < sum.length; i++) {
                        System.out.println(Arrays.toString(sum[i]));
                    }
    
                }
                    break;
                case 2: {
                    int[][] sub = new int[rows][columns];
                    for (int i = 0; i < Array1.length; i++) {
                        for (int j = 0; j < Array1[i].length; j++) {
                            sub[i][j] = Array1[i][j] - Array2[i][j] - Array3[i][j];
                            if(sub[i][j]==0){
                                a++;
                        }
                    }}
                    if(a==(rows*columns)){
                        System.out.println("this is null array");

                    }
                    System.out.println("Sub of 2D array: ");
                    for (int i = 0; i < sub.length; i++) {
                        System.out.println(Arrays.toString(sub[i]));
                    }
    
                }
                    break;
                case 3: {
                    int[][] mul = new int[rows][columns];
                    for (int i = 0; i < Array1.length; i++) {
                        for (int j = 0; j < Array1[i].length; j++) {
                            mul[i][j] = Array1[i][j] * Array2[i][j] * Array3[i][j];
                            if(mul[i][j]==0){
                                a++;
                        }}
                    }
                    System.out.println("mul of 2D array: ");
                    for (int i = 0; i < mul.length; i++) {
                        System.out.println(Arrays.toString(mul[i]));
                    }

    
                }
                if(a==(rows*columns)){
                    System.out.println("this is null array");

                }
                    break;
                case 4: {
                    int[][] div = new int[rows][columns];
                    for (int i = 0; i < Array1.length; i++) {
                        for (int j = 0; j < Array1[i].length; j++) {
                            div[i][j] = Array1[i][j] / Array2[i][j];
                            if(div[i][j]==0){
                                a++;
                        }
                    }
                    if(a==(rows*columns)){
                        System.out.println("this is null array");
                    }
                }          
                    System.out.println("div of 2D array: ");
                    for (int i = 0; i < div.length; i++) {
                        System.out.println(Arrays.toString(div[i]));
                    }
    
                } 
                    break;
                    
    
                default: {
                    System.out.println("This is invalid number");
                }
                    break;
                }
            }else{
                    System.out.println("This is null value");
            }
        }
    }  
     
    