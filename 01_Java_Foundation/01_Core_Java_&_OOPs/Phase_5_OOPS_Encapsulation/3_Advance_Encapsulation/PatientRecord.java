/*Hospital Patient Record Management

Now we'll use encapsulation for a hospital patient record, where certain information can be updated normally, while other information must be tightly controlled.

Still no constructors.

Problem Statement

A hospital needs a system to maintain basic patient records.

Create a class:

Patient

Each patient has:

patientId
patientName
age
medicalStatus
Business Rules
All fields must be private.
patientId can be assigned only once and must be greater than 0.
patientName can be viewed and changed, but cannot be null or empty.
age can be viewed and changed, but must be between 1 and 120.
medicalStatus can be viewed.
Medical status should not have a normal setter.
Status should be updated using updateMedicalStatus().
Only these statuses are allowed:
"Admitted"
"Under Treatment"
"Discharged"
Once a patient is "Discharged", their status should not be changed again. */
public class PatientRecord {
    private int patientId;
    private String patientName;
    private int age;
    private String medicalStatus;

    public void setPatientID(int patientId){
        if(this.patientId == 0 && patientId > 0){
            this.patientId = patientId;
        }else{
            System.out.println("Invalid Patient ID or Patient ID already assigned");
        }
    }

    public int getPatientID(){
        return patientId;
    }

    public void setPatientName(String patientName){
        if(patientName != null && !patientName.isEmpty()){
            this.patientName = patientName;
        }else{
            System.out.println("Invalid patient name");
        }
    }

    public String getPatientName(){
        return patientName;
    }

    public void setAge(int age){
        if(age >= 1 && age <= 120){
            this.age = age;
        }else{
            System.out.println("Age must be between 1 and 120");
        }
    }

    public int getAge(){
        return age;
    }

    public String getMedicalStatus(){
        return medicalStatus;
    }

    public void updateMedicalStatus(String medicalStatus){
        if(this.medicalStatus != null && this.medicalStatus.equals("Discharged")){
            System.out.println("Discharged patient's status cannot be changed");
        }else if (medicalStatus.equals("Admitted") ||
            medicalStatus.equals("Under Treatment") ||
            medicalStatus.equals("Discharged")) {
                this.medicalStatus = medicalStatus;
                System.out.println("Medical status updated successfully");
        }else{
            System.out.println("Invalid medical status");
        }
    }
    public static void main(String[] args) {
        PatientRecord patient = new PatientRecord();

        patient.setPatientID(501);
        patient.setPatientName("Rahul Sharma");
        patient.setAge(35);

        patient.updateMedicalStatus("Admitted");

        System.out.println();
        System.out.println("Patient Details");
        System.out.println(
            "Patient ID: " + patient.getPatientID()
        );
        System.out.println(
            "Name: " + patient.getPatientName()
        );
        System.out.println(
            "Age: " + patient.getAge()
        );
        System.out.println(
            "Status: " + patient.getMedicalStatus()
        );

        System.out.println();

        patient.updateMedicalStatus("Under Treatment");

        System.out.println(
            "Current Status: " + patient.getMedicalStatus()
        );

        patient.updateMedicalStatus("Discharged");

        System.out.println(
            "Current Status: " + patient.getMedicalStatus()
        );
    }
}
