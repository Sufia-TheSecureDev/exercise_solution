public class MeanAndDeviation{
	public double deviation(double[] x){
		double sum = this.summation(x);
		double deviation = Math.sqrt(Math.pow((sum - (sum/x.length)),2) / x.length-1);

		return deviation;
	}
	public double summation(double[] x){
		double sum = 0;
		for(int i= 0; i<x.length; i++){
			sum += x[i];
		}
		return sum;
	}
	public double mean(double[] x){
		double sum = this.summation(x);
		return sum / x.length;
	}
	public static void main(String[] args){
		double[] values = {18.88,11.78,11.07,16.12,12.44,14.22,11.78,15.90,19.14,15.66};

		MeanAndDeviation stat = new MeanAndDeviation();
		double deviation = stat.deviation(values);
		double mean = stat.mean(values);
		System.out.println("deviation : "+deviation);
		System.out.println("mean : "+mean);

	}
}