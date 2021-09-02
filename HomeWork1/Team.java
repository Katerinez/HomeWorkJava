package HomeWork1;

import java.util.Arrays;

public class Team {

    private String commandName;
    private String[] teamMembersName = new String[4];
    private String teamMembersNameStr;
    private int[][] teamMembersDist = new int[4][2];

    public Team(String commandName, String[] teamMembersName, int[][] teamMembersDist){
        this.commandName = commandName;
        this.teamMembersName = teamMembersName;
        this.teamMembersDist = teamMembersDist;
    }

    String getName() {
        return this.commandName;
    }

    public void memberInfo(int id){
        System.out.println("участник: "+this.teamMembersName[id]+
                " :бег на дистанцию-"+ teamMembersDist[id][0]+
                ", прыжок на высоту-"+ teamMembersDist[id][1]);
    }

    public int maxRun(int id){
        return this.teamMembersDist[id][0];
    }
    public int maxJump(int id){
        return this.teamMembersDist[id][1];
    }

}
