package Main;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ClinicPatientManager patientManager = new ClinicPatientManager();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("1. Insert Patient");
                System.out.println("2. Search Patient");
                System.out.println("3. Delete Patient");
                System.out.println("4. Update Patient");
                System.out.println("5. Display Patients");
                System.out.println("6. Save to File");
                System.out.println("7. Read from File");
                System.out.println("8. Schedule Meeting");
                System.out.println("9. Schedule Appointment");
                System.out.println("10. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                Meeting meeting = new MeetingImpl(); 
                Appointment appointment = new AppointmentImpl(); 
                
                switch (choice) {
                    case 1: {
                        System.out.print("Enter patient name: ");
                        String name = scanner.next();
                        System.out.print("Enter patient category: ");
                        String category = scanner.next();
                        patientManager.insertPatient(name, category);
                        System.out.println("Successfully inserted!");
                        break;
                    }
                    case 2: {
                        System.out.print("Enter patient name to search: ");
                        String searchName = scanner.next();
                        Person searchedPatient = patientManager.searchPatient(searchName);
                        if (searchedPatient != null) {
                            System.out.println("Patient found: " + searchedPatient);
                        } else {
                            System.out.println("Patient not found.");
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("Enter patient name to delete: ");
                        String deleteName = scanner.next();
                        patientManager.deletePatient(deleteName);
                        System.out.println("Successfully deleted!");
                        break;
                    }
                    case 4: {
                        System.out.print("Enter patient name to update: ");
                        String updateName = scanner.next();
                        System.out.print("Enter new patient category: ");
                        String newCategory = scanner.next();
                        patientManager.updatePatient(updateName, newCategory);
                        System.out.println("Successfully updated!");
                        break;
                    }
                    case 5: {
                        System.out.println("Patients in the clinic:");
                        patientManager.displayPatients();
                        break;
                    }
                    case 6: {
                        System.out.print("Enter file name to save: ");
                        String saveFileName = scanner.next();
                        patientManager.saveToFile(saveFileName);
                        System.out.println("Data successfully saved to file!");
                        break;
                    }
                    case 7: {
                        System.out.print("Enter file name to read: ");
                        String readFileName = scanner.next();
                        patientManager.readFromFile(readFileName);
                        System.out.println("Data successfully read from file!");
                        break;
                    }

                    case 8: {
                        System.out.print("Enter meeting day: ");
                        String day = scanner.next();
                        System.out.print("Enter meeting time: ");
                        String time = scanner.next();
                        System.out.print("Enter meeting location: ");
                        String location = scanner.next();
                        meeting.schedule(day, time, location);
                        break;
                    }         
                    
                    case 9: {
                        System.out.print("Enter appointment date: ");
                        String date = scanner.next();
                        System.out.print("Enter appointment time: ");
                        String time = scanner.next();
                        System.out.print("Enter appointment purpose: ");
                        String purpose = scanner.next();
                        System.out.print("Enter appointment location: ");
                        String appointmentLocation = scanner.next();
                        appointment.schedule(date, time, purpose, appointmentLocation);
                        break;
                    }
                    
                   case 10:{
                        System.out.println("Exiting...");
                         break;
                    
                }

                default:
                        System.out.println("Invalid choice. Please try again.");
                     break;
            } 
           
        }while (choice != 10);
    }
}
}
