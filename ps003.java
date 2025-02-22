
public class ps003 {
    
   
        
        private String name;
        private int wickets;
        private int matches;
        private int ballsBowled;
        private int runsConceded;
    
        
        public ps003() {
            this.name = "Unknown";
            this.wickets = 0;
            this.matches = 0;
            this.ballsBowled = 0;
            this.runsConceded = 0;
        }
    
        
        public ps003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
            this.name = name;
            this.wickets = wickets;
            this.matches = matches;
            this.ballsBowled = ballsBowled;
            this.runsConceded = runsConceded;
        }
    
        
        public void computeBowlingAverage() {
            if (wickets == 0) {
                System.out.println("Bowling average cannot be calculated as wickets are 0.");
            } else {
                double bowlingAverage = (double) runsConceded / wickets;
                System.out.println("Bowling Average of " + name + ": " + bowlingAverage);
            }
        }
    
       
        public static void main(String[] args) {
            
            ps003 bowler1 = new ps003();
            bowler1.computeBowlingAverage();
    
            
            ps003 bowler2 = new ps003 ("Dev", 25, 10, 600, 500);
            bowler2.computeBowlingAverage();
        }
    }
