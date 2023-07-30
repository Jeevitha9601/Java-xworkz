package MainRunner;

import main.Doctor;
import main.Hospital;
import main.Nurse;

public class HospitalRunner {
	public static void main(String[] args) {
Hospital hospital=new Hospital();
hospital.doctor();
hospital.operation();
Doctor doctor=new Doctor();
doctor.checkUp();
doctor.qualification();
Nurse nurse=new Nurse();
nurse.name();
nurse.injection();

}
}