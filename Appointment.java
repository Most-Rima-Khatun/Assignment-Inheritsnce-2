 public abstract class Appointment
    {
        private String description;


        public Appointment()
        {
            description = "";
        }

        public Appointment(int i, String s) {
        }


        public void setDescription(String description)
        {
            this.description = description;
        }


        public abstract boolean occursOn(int year, int month, int day);


        public String toString()
        {
            return description;
        }
    }


    

