package Main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class ClinicPatientManager implements Iterable<Person> {
    private List<Person> patients = new ArrayList<>();

    public void insertPatient(String name, String category) {
        patients.add(new Person(name, category));
    }

    public Person searchPatient(String name) {
        for (Person patient : patients) {
            if (patient.getName().equals(name)) {
                return patient;
            }
        }
        return null;
    }

    public void deletePatient(String name) {
        Iterator<Person> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Person patient = iterator.next();
            if (patient.getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }

    public void updatePatient(String name, String newCategory) {
        for (int i = 0; i < patients.size(); i++) {
            Person patient = patients.get(i);
            if (patient.getName().equals(name)) {
                patients.set(i, new Person(name, newCategory));
                break;
            }
        }
    }

    public void displayPatients() {
        for (Person patient : patients) {
            System.out.println(patient);
        }
    }

    public void saveToFile(String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(patients);
        } catch (IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    public void readFromFile(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            patients = (List<Person>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
    }

    @Override
    public Iterator<Person> iterator() {
        return patients.iterator();
    }
}
