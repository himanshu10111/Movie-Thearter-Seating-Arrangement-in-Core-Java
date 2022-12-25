import java.util.*;

class project {
    public static void Func(int[][] locations) {
        Scanner sc = new Scanner(System.in);
        int Seatno = sc.nextInt();
        System.out.println("Enter row index and coloumn index from above chart:");
        int row_index = sc.nextInt();
        int coloumn_index = sc.nextInt();
        System.out.println("Thanks!");

        locations[row_index][coloumn_index]=1;
        int updated_count=1;
        for(int i=0;i<locations.length;i++) {
            for(int j=0;j<locations[i].length;j++) {
                System.out.print("Seat no.: " + updated_count + "["+i+"]"+"["+j+"]");
                System.out.print( "---->" + "("+ locations[i][j]+")"+"\t");
                //vacant seats are shown as 0 and booked seats are shown as 1
                updated_count++;
            }
            System.out.println();
        }

        System.out.println("Your seat has been booked successfully! Enjoy your show :-)");
    }
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int[][] locations=new int[10][10];
            int count=1;

            System.out.println("-------------------------------------------------------------Welcome to CityPride Theatre--------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------Available Seats--------------------------------------------------------------------");

            for(int i=0;i<locations.length;i++) {
                for(int j=0;j<locations[i].length;j++) {
                    System.out.print("Seat no.: " + count + "["+i+"]"+"["+j+"]");
                    System.out.print( "---->" + "("+ locations[i][j]+")"+"\t");
                    //vacant seats are shown as 0 and booked seats are shown as 1
                    count++;
                }

                System.out.println();
            }

            System.out.println("Choose the Seat Number where you would like to watch you favourite movie from Seat No. 1 to 100:"+" ");
            Func(locations);

        }

           }
