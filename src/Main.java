public class Main {
    public static void main(String[] args) {
        regularEmp();
        partEmp();}
        public static void regularEmp(){
            int wagePerDay = 160;
            int workingDay = 0;
            int absDays = 0;
            int month = 0;
            int workingHours=0;

            while(workingDay <=20 && month <30 ) {
                while(workingDay <=20 && month <30 && workingHours <= 96 ) {

                    int attendance = (int) ((Math.random() * 10) % 2);

                    switch (attendance) {
                        case 0:
                            workingDay++;
                            month++;
                            workingHours += 8;
                            break;
                        default:
                            month++;
                    }}}

        }
        public static void partEmp(){
            int partWorkingDay = 0;
            int partMonth = 0;
            int partAbsDays = 0;
            int partWorkingHours = 0;

            while(partWorkingDay <= 20 && partMonth<30) {

                while(partWorkingDay <= 20 && partMonth<30 && partWorkingHours <= 96) {

                    int partAttendance = (int) ((Math.random() * 10) % 2);

                    switch (partAttendance) {
                        case 0:
                            partMonth++;
                            partWorkingDay++;
                            partWorkingHours += 8;
                            break;
                        default:
                            partMonth++;
                            partAbsDays++;
                    }
                }
                System.out.println("Part Time Employee is Present for "+partWorkingDay+ " Days");
                int wagePerDay = 0;
                int partWage = wagePerDay * partWorkingDay;
                System.out.println("Daily Wage of Part Time Employee : " + partWage);
                System.out.println("Part Time Employee was Absent for " +partAbsDays+ " Days");
            }
        }
    }

