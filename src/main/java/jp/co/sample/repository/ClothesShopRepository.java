package jp.co.sample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.ClothesShop;

@Repository
@Transactional
public class ClothesShopRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<ClothesShop> CLOTHESSHOPROWMAPPER=(rs,i)->{
		ClothesShop clothesShop = new ClothesShop();
		clothesShop.setId(rs.getInt("id"));
		clothesShop.setString(rs.getString("category"));
		clothesShop.setString(rs.getString("genre"));
		clothesShop.setId(rs.getInt("id"));
		clothesShop.setId(rs.getInt("id"));
		clothesShop.setId(rs.getInt("id"));
		clothesShop.setId(rs.getInt("id"));
		clothesShop.setId(rs.getInt("id"));
		
		return null;
		
	};
}
