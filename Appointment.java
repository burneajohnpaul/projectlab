
package Main;

interface Appointment extends Activity{
    void schedule(String date, String time, String purpose, String location);
    @Override
    void cancel();
    void reschedule(String newDate, String newTime, String newLocation);
    void setReminder(int minutesBefore);
}

