package Main;

public interface Meeting extends Activity {
    void schedule(String date, String time, String location);
    @Override
    void cancel();
    void reschedule(String newDate, String newTime, String newLocation);
    void conductMeeting();
}

