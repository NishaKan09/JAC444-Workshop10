/********************************************************************************
 Workshop # 10
 Course: JAC444 - Semester 4
 Last Name: Kanagasapabathy
 First Name: Nishantha (Nisha)
 ID: 135015162
 Section: NB
 This assignment represents my own work in accordance with Seneca Academic Policy.
 Signature
 Date: Aug 11th/2020
 *********************************************************************************/

package ca.senecacollege.ws10;

public class Time implements Cloneable, Comparable{
    private long time;

    public Time(){
        time = (System.currentTimeMillis() / 1000);
    }

    public Time(int hr, int min, int sec){
        time = (((hr * 60) + min) * 60) + sec;
    }

    public Time(long time){
        this.time = time;
    }

    public int getHour() { return (int) (time / 3600); }
    public int getMinute() {
        return (int) (time - (getHour() * 3600)) / 60;
    }
    public int getSecond() {
        return (int) time - (getHour() * 3600) - (getMinute() * 60);
    }
    public long getSeconds(){
        return time;
    }

    public String toString(){
        String display = String.format("%d hour(s) %d minute(s) %d second(s) \n", getHour(), getMinute(), getSecond());
        return display;
    }

    @Override
    public int compareTo(Object obj){
        int diff = (int) (time - ((Time)obj).time);
        return diff;
    }

    public Time clone(){
        Time time2 = new Time();
        time2.time = time;
        return time2;
    }

}

