package com.cg.client;

import com.cg.app.GSNormalAcc;
import com.cg.app.GSPrimeAcc;
import com.cg.app.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFact;

public class Client {

	public static void main(String[] args) {
	ShopFact s=new GSShopFactory();	
	PrimeAcc p=new GSPrimeAcc(123," Rahul ",300, true);
	NormalAcc n= new GSNormalAcc(456," RAHUL ",750,50);
	System.out.println("Prime Account");
	p.bookproduct(p.getCharges());
	System.out.println("Normal Account");
	n.bookproduct(n.getCharges());
	System.out.println(p);
	System.out.println(n);

	}
	

}