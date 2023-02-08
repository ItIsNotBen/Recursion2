import java.lang.StackOverflowError;

public class Main {

    static int[] data = {13, 13, 18, 19, 23, 38, 57, 70, 79, 88, 89, 94, 102, 108, 122, 125, 127, 177, 180, 201, 210, 221, 226, 226, 234, 237, 247, 293, 295, 297, 303, 317, 320, 339, 343, 373, 375, 378, 378, 380, 403, 405, 407, 408, 412, 440, 466, 479, 485, 486, 493, 504, 509, 525, 537, 564, 565, 570, 578, 581, 584, 589, 605, 611, 617, 621, 650, 665, 669, 692, 696, 714, 742, 756, 756, 763, 766, 776, 780, 789, 817, 857, 881, 882, 883, 885, 897, 898, 906, 909, 911, 916, 929, 929, 939, 941, 958, 985, 988, 994};;

    public static int recBinary(int target, int lower, int up) {
        int midpoint = (int) ((lower + up) / 2);

        if (data[midpoint] == target) {
            return midpoint;
        }
        if (lower == up) {
            return -1;
        }
        if (data[midpoint] < target) {
            recBinary(target, midpoint, up);
        }
        if (data[midpoint] > target) {
            recBinary(target, lower, midpoint);
        }


    }


        public static void main (String[]args){
            int target = 57;

            for (int i = 0; i < data.length; i++) {
                boolean isFound;
                if (data[i] == target) {
                    isFound = true;
                } else {
                    isFound = false;
                }
            }

            System.out.println(recBinary(102, 0, data.length - 1);

        }
    }

