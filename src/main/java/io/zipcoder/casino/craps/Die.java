package io.zipcoder.casino.craps;

public class Die {


        private int dieRoll;
        public Die() {
            dieRoll = 0;
        }
        public int roll(){
            dieRoll = (int) (Math.random() * 6) +1;
            return dieRoll;
        }


}




