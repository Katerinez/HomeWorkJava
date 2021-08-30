package HomeWork1;

public class Course {
    private int runningTrack ;
    private int plankHeight;

    public Course(int runningTrack, int plankHeight){
        this.runningTrack = runningTrack;
        this.plankHeight = plankHeight;
    }

    public void memberInfoCourse(){
        System.out.println("бег на дистанцию-"+ this.runningTrack+
                " прыжок на высоту-"+ this.plankHeight);
    }

    public int getRuningTrack(){
        return this.runningTrack;
    }

    public int getPlankHeight(){
        return this.plankHeight;
    }
}