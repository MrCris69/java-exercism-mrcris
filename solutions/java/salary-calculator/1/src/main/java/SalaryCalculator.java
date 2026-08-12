public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped>=5) ? 0.85 : 1.00;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold>=20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return (bonusMultiplier(productsSold)*productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        float salary = (float)((salaryMultiplier(daysSkipped)*1000.00f)+bonusForProductsSold(productsSold));
        if (salary>=2000.00){
            return 2000.00f;
        }
        else{
            return salary;
        }
    } 
}
