 public class BMI{
	public static final double KG_PER_POUND = 0.45359237;
	public static final double METER_PER_INCH = 0.0254;
	private String name;
	private double weight;
	private double height;

	public BMI(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public double getBmi(){
		double kg = weight * KG_PER_POUND;
		double m = height * METER_PER_INCH; 
		return   kg/(m*m);
	}
	public String getStatus(){
		double bmi = getBmi();
		if(bmi < 18.5){
			return "underweight";
		}else if (bmi < 25){
			return "normal";
		}else if (bmi < 29.9){
			return "overweight";
		}
			return "Moderatelu obese";
		
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args){
		BMI bmi = new BMI("sania",145 , 70);
		System.out.println("the bmi for "+bmi.getName() + " is ("+ String.format("%.2f", bmi.getBmi()) + ") "+ bmi.getStatus());
	}
}
 