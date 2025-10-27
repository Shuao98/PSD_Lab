public class Employee{
    public int id;
    public String f_name;
    public String g_name;
    public double basic_hourly_rate, contracted_hours, worked_hours;
    public Employee(int id, String f, String g, double b, double c){
        this.id = id;
        this.f_name = f;
        this.g_name = g;
        this.basic_hourly_rate = b;
        this.contracted_hours = c;
        this.worked_hours = 0;
    }
    public double computePay(){
        double total = 0;
        if(this.worked_hours > this.contracted_hours ){
            total += contracted_hours*basic_hourly_rate +(worked_hours-contracted_hours)*1.5*basic_hourly_rate;
        }else{
            total += contracted_hours*basic_hourly_rate;
        }
        return total;
    }
}