import java.util.Scanner;

import static java.lang.System.out;

public class TVShow {

    private String showID;
    private String showName;
    private double startTime;
    private double endTime;

    public double getEndTime() {
        return endTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public String getShowID() {
        return showID;
    }

    public String getShowName() {
        return showName;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void setShowID(String showID) {
        this.showID = showID;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public TVShow(String showID, String showName, double startTime, double endTime) {
        this.endTime = endTime;
        this.showID = showID;
        this.showName = showName;
        this.startTime = startTime;
    }

    //Copy Constructor

    public TVShow clone() {
        Scanner scanner = new Scanner(System.in);
        String newShowID;
        out.println(" Enter a new show ID for the clone: ");
        newShowID = scanner.next();
        TVShow TVShowClone = new TVShow(newShowID, showName, startTime,endTime);
        return TVShowClone;
    }

    public String toString() {
        return "toString";
    }

    public boolean equals(TVShow obj) {
        return (obj.getEndTime() == endTime && obj.getStartTime() == startTime && obj.getShowName() == showName);
    }


}
