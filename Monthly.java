public class Monthly {

    //HIDE
    public class AppointmentTester
    {
        public static void main(String[] args)
        {
            System.out.print("Monthly is subclass of Appointment: ");
            Object equalsto;
            System.out.println(Monthly.class.getSuperclass() equalsto Appointment.class);
            System.out.println("Expected: true");
            System.out.print("Onteime is subclass of Appointment: ");
            System.out.println(Onetime.class.getSuperclass() == Appointment.class);
            System.out.println("Expected: true");
            System.out.print("Monthly appointments have no extra fields:");
            System.out.println(Monthly.class.getDeclaredFields().length == 1);
            System.out.println("Expected: true");
            System.out.print("Onetime appointments have no extra fields:");
            System.out.println(Onetime.class.getDeclaredFields().length == 3);
            System.out.println("Expected: true");

// Try some appointments
            Appointment obj = new Monthly(15, "pay the bills");
            System.out.println(obj.occursOn(2016, 8, 15));
            System.out.println("Expected: true");
            obj = new Onetime(2016, 11, 1, "Dentist appointment.");
            System.out.println(obj.occursOn(2016, 10, 1));
            System.out.println("Expected: false");
            System.out.println(obj.occursOn(2016, 11, 1));
            System.out.println("Expected: true");
        }
    }
    Appointment Tester 2

    public class AppointmentTester2
    {
        public static void main(String[] args)
        {
            Appointment obj = new Appointment(15, "pay the bills") {
                @Override
                public boolean occursOn(int year, int month, int day) {
                    return false;
                }
            };
            System.out.println(obj.occursOn(2016, 8, 15));
            System.out.println("Expected: true");
            obj = new Appointment(2016, 11, 1, "Dentist appointment.");
            System.out.println(obj.occursOn(2016, 10, 1));
            System.out.println("Expected: false");
            System.out.println(obj.occursOn(2016, 11, 1));
            System.out.println("Expected: true");
        }
    }
}
