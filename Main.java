public class Main
 {

        public static void main(String[] args)
        {

            int i = 4;
            int finishNumber = 20;
            int evenCount = 0;
            int oddCount = 0;

            while (i <= finishNumber)
            {
                i++;
                if (!isEvenNumber(i))
                {
                    oddCount++;
                    continue;
                }
                System.out.println("Even number " + i);
                evenCount++;
                if (evenCount >= 5)
                {
                    break;
                }
            }

            System.out.println("Total odd numbers found = " + oddCount);
            System.out.println("Total even numbers found = " + evenCount);
        }

        public static boolean isEvenNumber(int number) {

            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }
 }


