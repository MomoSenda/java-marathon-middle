package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.sample.domain.ClothesShop;

/**
 * 洋服店の情報をデータベースに登録する.
 * 
 * @author momo.senda
 *
 */
@Repository

public class ClothesShopRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<ClothesShop> CLOTHESSHOPROWMAPPER = (rs, i) -> {
		ClothesShop clothesShop = new ClothesShop();
		clothesShop.setId(rs.getInt("id"));
		clothesShop.setCategory(rs.getString("category"));
		clothesShop.setGenre(rs.getString("genre"));
		clothesShop.setGender(rs.getInt("gender"));
		clothesShop.setColor(rs.getString("color"));
		clothesShop.setPrice(rs.getInt("price"));
		clothesShop.setSize(rs.getString("size"));
		return clothesShop;
	};

	public List<ClothesShop> findByGenderAndColor(int gender, String color) {
		String sql = "SELECT id,category,genre,gender,color,price,size From shops WHERE gender=:gender and color=:color ORDER BY id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("gender", gender).addValue("color", color);

		List<ClothesShop> clothesShopList = template.query(sql, param, CLOTHESSHOPROWMAPPER);

		return clothesShopList;
	}
}
