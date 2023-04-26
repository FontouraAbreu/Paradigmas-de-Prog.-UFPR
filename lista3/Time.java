public class Time {
    private int hour;
    private int minute;

    // CONSTRUCTORS
    public Time() {
        setHour(0);
        setMinute(0);
    }

    public Time(int hour) {
        setHour(hour);
        setMinute(0);
    }

    public Time(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    // SETTERS
    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            this.hour = 0;
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        }
        this.minute = minute;
    }

    // GETTERS

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    // METHODS
    public boolean anterior(int h, int m) {
        // if is invalid
        if (!checkValidation(h, m))
            return false;
        // if is any hour before
        if (h < getHour())
            return true;
        // if is the same hour but minutes before
        if (h == getHour() && m < getMinute())
            return true;
        // if is the same or after
        return false;
    }

    public boolean posterior(int h, int m) {
        // if is invalid
        if (!checkValidation(h, m))
            return false;
        // if is any hour after
        if (h > getHour())
            return true;
        // if is the same hour but minutes after
        if (h == getHour() && m > getMinute())
            return true;
        // if is the same or before
        return false;
    }

    public boolean equals(int h, int m) {
        // if is invalid
        if (!checkValidation(h, m))
            return false;
        // if is the same hour and minute
        if (h == getHour() && m == getMinute())
            return true;
        // if is not the same hour and minute
        return false;
    }

    private boolean checkValidation(int h, int m) {
        if (h < 0 || h > 23 || m < 0 || m > 59)
            return false;
        return true;
    }

    public String toString() {
        return String.format("%02d:%02d", getHour(), getMinute());
    }

}