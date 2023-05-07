package Ex3;

public class DoctorBO {
    public Doctor createDoctor(String details) throws InvalidDoctorException {
        String[] doctorDetails = details.split(",");
        String name = doctorDetails[0];
        String email = doctorDetails[1];
        String mobileNumber = doctorDetails[2];
        String qualification = doctorDetails[3];
        int experience = Integer.parseInt(doctorDetails[4]);

        if (qualification.equals("MBBS") || qualification.equals("BDS") || qualification.equals("BAMS")
                || qualification.equals("BHMS") || qualification.equals("BYNS")) {
            return new Doctor(name, email, mobileNumber, qualification, experience);
        } else {
            throw new InvalidDoctorException("Invalid doctor qualification");
        }
    }
}

