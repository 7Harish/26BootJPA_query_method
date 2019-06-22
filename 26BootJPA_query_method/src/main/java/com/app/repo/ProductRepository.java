package com.app.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	/****1....select Query
	 * @Query("select p from com.app.model.Product p")
	 *  List<Product> getMyData();
	 */
	/*********************************************************************************/
	/*
	 * @Query("select p.prodCost from com.app.model.Product p") 
	 * List<Double> getCostsOnly();
	 */
	/*
	 * @Query("select p.prodCode,p.prodCost from com.app.model.Product p")
	 * List<Object[]> getInfo();
	 */
	/*********************************************************************************/
	/*
	 * @Query("select p from com.app.model.Product p where p.prodId=?1 or p.prodCost<?2")
	 *  List<Product> getNewData(Integer id,Double code);
	 */
	/*********************************************************************************/
	/*
	 * @Query("select p.prodCode from com.app.model.Product p where p.prodId=?1 or p.prodCost<?2")
	 *  List<String> getNewData(Integer id,Double code);
	 */
	/*********************************************************************************/
	/*@Query("select p.prodCode from com.app.model.Product p where p.prodId=:a or p.prodCost<:b")
	 List<String> getNewData(Integer a,Double b);*/
	/*********************************************************************************/
	@Query("select p from com.app.model.Product p where p.prodId in(?1,?2) order by p.prodId desc")
	List<Product> getAnyData(Integer id,Integer id2);
	/*********************************************************************************/
	/*********************************************************************************/
	/**2.Non select Query *********
	@Query("update Product p set p.prodCost=:cost where p.prodId=:id")
	//Hibernate: update product set prod_cost=? where prod_id=?
	@Transactional
	@Modifying
	int updateCost(Double cost,Integer id);
	@Transactional
	@Modifying
	@Query("delete Product p where p.prodId=:id")
	int removeData(Integer id);
	 **********************************************************************/
}
