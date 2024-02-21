public class Progression {

         protected long current;


                 public Progression( ) { this(0); }


                 public Progression(long start) { current = start; }


                 public long nextValue( ) {
             long answer = current;
             advance( ); // this protected call is responsible for advancing the current value
             return answer;
             }


                 protected void advance( ) {
            current++;
             }


                 public void printProgression(int n) {
            System.out.print(nextValue( )); // print first value without leading space
             for (int j=1; j < n; j++)
                 System.out.print(" " + nextValue( )); // print leading space before others
            System.out.println( ); // end the line
            }
 }






