package CastingMain;

import Casting.Brand;
import Casting.DuplicateBrand;
import Casting.InternationalBrand;
import Casting.LocalBrand;
import Casting.NationalBrand;
import Casting.NationalZoo;
import Casting.StateZoo;
import Casting.Zoo;

public class BrandUtil {
public void run(Brand brand) {
	Brand brand1=new Brand();
	brand1.bradName();
	
	if(brand instanceof LocalBrand) {
		Brand brand2=new LocalBrand();
		brand2.bradName();
		
		LocalBrand localBrand=new LocalBrand();
		localBrand.getLocalBradName();
		}
	if(brand instanceof NationalBrand) {
		Brand brand3=new NationalBrand();
		brand3.bradName();
		
		NationalBrand nationalBrand=new NationalBrand();
		nationalBrand.getNationalBradName();
	}
		if(brand instanceof DuplicateBrand) {
			Brand brand4=new DuplicateBrand();
			brand4.bradName();
			
			DuplicateBrand duplicateBrand=new DuplicateBrand();
			duplicateBrand.getDuplicateBradName();
			
	}
		if(brand instanceof InternationalBrand) {
			Brand brand5=new InternationalBrand();
			brand5.bradName();
			
			InternationalBrand internationalBrand=new InternationalBrand();
			internationalBrand.getBrandByName();
}
}
}
