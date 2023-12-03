    package Main;



    class MeetingImpl implements Meeting {

        MeetingImpl(String meeting, String category) {
        }
        private String date;
        private String time;
        private String location;
        private boolean isScheduled;

        MeetingImpl() {

        }


        @Override
        public void schedule(String date, String time, String location) {
            this.date = date;
            this.time = time;
            this.location = location;
            this.isScheduled = true;
            System.out.println("Meeting scheduled for " + date + " at " + time + " in " + location);
        }

        @Override
        public void cancel() {
            if (isScheduled) {
                System.out.println("Meeting canceled");
                isScheduled = false;
            } else {
                System.out.println("No meeting is scheduled.");
            }
        }

        @Override
        public void reschedule(String newDate, String newTime, String newLocation) {
            if (isScheduled) {
                this.date = newDate;
                this.time = newTime;
                this.location = newLocation;
                System.out.println("Meeting rescheduled for " + newDate + " at " + newTime + " in " + newLocation);
            } else {
                System.out.println("No meeting is scheduled to reschedule.");
            }
        }

        @Override
        public void conductMeeting() {
            if (isScheduled) {
                System.out.println("Meeting conducted at " + time + " in " + location);
            } else {
                System.out.println("No meeting is scheduled to conduct.");
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






