package com.app.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {
		/****1......SELECT QUERY
		 * List<Product> p=repo.getMyData(); 
		 * for (Product product : p) {
		 * System.out.println(product); }
		 */
		/*****************************************************************************************************/
		/* repo.getCostsOnly().forEach(System.out::println); */
		/*****************************************************************************************************/
		//repo.getInfo().forEach(System.out::println);
		/* repo.getInfo().forEach(p->System.out.println(p[0]+"   "+p[1]));; */
		/*****************************************************************************************************/
		/* repo.getNewData(3, 1.1).forEach(System.out::println); */
		//repo.getAnyData(3,7).forEach(System.out::println);

		/** Non- select query
		 int count=repo.updateCost(3.8, 3); 
		int count=repo.removeData(3);
		System.out.println(count);
		 ***/











	}

}
