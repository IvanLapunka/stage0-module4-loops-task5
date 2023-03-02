package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i <= height; i++){
            if (i == height / 2) continue;
            for (int j = 0; j < height; j++) {
                if (j >= Math.min(i, height - i) && j < height - Math.min(i, height -i)){
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
