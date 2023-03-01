public class T1Parking {
    public static void main(String[] args) {

        int time=0;
        double fee=0;

        if (time>=6 && time<=12){
            fee=7.5;

        }else {
          fee=15;
        }
        System.out.println("Fee for parking is :"+fee);
        System.out.println("----------------------------------");

        String result=(time>=0 && time<=12)?"Fee is for parking :7.5"
                :"Fee is for parking :7.5";
    }
}
 /*
    T1Parking [ternary, relational]

    create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

        If the time is between 6-12:
            fee: 7.50

        if the time is between 13 - 23 or 0 - 5
            fee is 15

     */