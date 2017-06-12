package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Profit;
import jdbc.JdbcConn;

public class Service {

	private Connection dbconnection;
	private Statement st,st1,st2;
	private ResultSet rs,rs1,rs2;
	private String sql;
	private List<Profit> list;
	private Profit pf;
	
	public List getProfit(){
		
		list = new ArrayList();
		dbconnection = JdbcConn.getConnection();
		try {
			st = dbconnection.createStatement();
			st1 = dbconnection.createStatement();
			st2 = dbconnection.createStatement();
			sql = "";//查询
			rs = st.executeQuery(sql);
			
			int temp;
			while(rs.next()){
				
				pf = new Profit();
				
				pf.setGoodsName(rs.getString("goodsName"));
				pf.setSellingPrice(rs.getInt("sellingPrice"));
				pf.setCostPrice(rs.getInt("costPrice"));
				pf.setGoodsId(rs.getInt("goodsId"));
				
				temp = 0;
				temp = pf.getSellingPrice() - pf.getCostPrice();
				sql = ""+ pf.getGoodsId();//取得单一商品的购买次数
				rs1 = st1.executeQuery(sql);
				while(rs1.next()){
					
					pf.setTradingNum(rs1.getInt("sumNum"));
				}
				
				pf.setProfit(temp * pf.getTradingNum());
				
				sql = ""+ pf.getGoodsId();//取得单一商品的购买次数
				rs2 = st2.executeQuery(sql);
				while(rs2.next()){
					
					pf.setTimes(rs2.getInt("times"));
				}
				
				list.add(pf);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally{
			
			if(rs != null){
				try {
					rs.close();
					rs=null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(st !=null){
				try {
					st.close();
					st=null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		return list;
	}
}
