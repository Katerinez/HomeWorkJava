package HomeWork1;

import java.util.Random;

public class HomeWork1 {

    public static Random random = new Random();

    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }

    public static void main(String[] args){

        String[] comItems = new String[4];
        comItems[0] = "Nif-Nif";
        comItems[1] = "Naf-Naf";
        comItems[2] = "Nuf-Nuf";
        comItems[3] = "Wolf";

        int[][] memberDistanceValue = new int[4][2];
        for (int i=0; i<4; i++){
            for (int j=0; j<2; j++){
                switch (j) {
                    case 0:
                        memberDistanceValue[i][j] = randomIntRange(100, 500);
                        break;
                    case 1:
                        memberDistanceValue[i][j] = randomIntRange(1, 5);
                        break;
                }
            }
        }

        Team team1 = new Team( "Lucky", comItems, memberDistanceValue);
        Course course1 = new Course(randomIntRange(100, 500), randomIntRange(1,5));

        System.out.println("Полоса препятствий: ");
        course1.memberInfoCourse();
        System.out.println();
        System.out.println("Команда: \"" + team1.getName()+ "\"" );
        for (int i=0; i<4; i++){
            team1.memberInfo(i);
        }
        System.out.println();
        System.out.println("Полосу препятсвий преодолели:");

        int winnerCount=0;
        for (int i=0; i<4; i++) {
            if (team1.maxRun(i) >= course1.getRuningTrack() &&
                    team1.maxJump(i) >= course1.getPlankHeight() ){
                team1.memberInfo(i);
                winnerCount++;
            }
        }

        if (winnerCount == 0){
            System.out.println("Команда проиграла :\'(");
        }
    }
}
