public class Main {


        public static void main(String args[])
        {
            String s = "s";
            for (int beers=99; beers>-1;)
            {
                System.out.print(beers + " bottle" + s + " of beer on the wall, ");
                System.out.println(beers + " bottle" + s + " of beer, ");
                if (beers==0)
                {
                    System.out.print("no more bottle of beer on the wall, ");
                    System.exit(0);
                }
                else
                    System.out.print("Take one down, pass it around, ");
                s = (--beers == 1)?"":"s";
                System.out.println(beers + " bottle" + s + " of beer on the wall.\n");
            }
        }
    }//thank you

