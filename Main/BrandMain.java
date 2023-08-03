package Main;

import Casting.Brand;
import Casting.DuplicateBrand;
import Casting.InternationalBrand;
import Casting.LocalBrand;
import Casting.NationalBrand;
import CastingMain.BrandUtil;

public class BrandMain {

	public static void main(String[] args) {
		Brand brand=new Brand();
		LocalBrand localBrand=new LocalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		DuplicateBrand duplicateBrand=new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		
		BrandUtil brandUtil=new BrandUtil();
		System.out.println("Calling run method with brand  ref");
		brandUtil.run(brand);
		
		BrandUtil brandUtil1=new BrandUtil();
		System.out.println("Calling run method with localBrand  ref");
		brandUtil1.run(localBrand);
		
		BrandUtil brandUtil2=new BrandUtil();
		System.out.println("Calling run method with nationalBrand  ref");
		brandUtil2.run(nationalBrand);
		
		BrandUtil brandUtil3=new BrandUtil();
		System.out.println("Calling run method with duplicateBrand  ref");
		brandUtil3.run(duplicateBrand);
		
		BrandUtil brandUtil4=new BrandUtil();
		System.out.println("Calling run method with internationalBrand  ref");
		brandUtil4.run(internationalBrand);
	}

}
