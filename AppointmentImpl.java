package Main;

class AppointmentImpl implements Appointment {
    private String date;
    private String time;
    private String purpose;
    private String location;
    private boolean isScheduled;

    @Override
    public void schedule(String date, String time, String purpose, String location) {
        this.date = date;
        this.time = time;
        this.purpose = purpose;
        this.location = location;
        this.isScheduled = true;
        System.out.println("Appointment scheduled for " + date + " at " + time + " for " + purpose + " in " + location);
    }

    @Override
    public void cancel() {
        if (isScheduled) {
            System.out.println("Appointment canceled");
            isScheduled = false;
        } else {
            System.out.println("No appointment is scheduled.");
        }
    }

    @Override
    public void reschedule(String newDate, String newTime, String newLocation) {
        if (isScheduled) {
            this.date = newDate;
            this.time = newTime;
            this.location = newLocation;
            System.out.println("Appointment rescheduled for " + newDate + " at " + newTime + " in " + newLocation);
        } else {
            System.out.println("No appointment is scheduled to reschedule.");
        }
    }

    @Override
    public void setReminder(int minutesBefore) {
        if (isScheduled) {
            System.out.println("Reminder set for appointment at " + time + " - " + minutesBefore + " minutes before.");
        } else {
            System.out.println("No appointment is scheduled to set a reminder.");
        }
    }

    @Override
    public void schedule() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reschedule() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}