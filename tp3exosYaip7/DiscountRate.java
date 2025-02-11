package tp3exosYaip7;

public class DiscountRate {
	
	private double 
			serviceDiscountPremium = 0.2,
			serviceDiscountGold = 0.15,
			serviceDiscountSilver =0.1,
			productDiscountPremium = 0.1,
			productDiscountGold =0.1,
			productDiscountSilver = 0.1;
	
	public double getServiceDiscountRate(String Type) {
		if (Type =="Premium") {
			return serviceDiscountPremium;
		}
		else if(Type =="Gold") {
			return serviceDiscountGold;
		}
		else if(Type == "Silver") {
			return serviceDiscountSilver;
		}
		return 0.0;//pas de Discount 
	}
	
	public double getProductDiscountRate(String Type) {
		if (Type =="Premium") {
			return productDiscountPremium;
		}
		else if(Type =="Gold") {
			return productDiscountGold;
		}
		else if(Type == "Silver") {
			return productDiscountSilver;
		}
		return 0.0;//pas de Discount 
	}
	
}
