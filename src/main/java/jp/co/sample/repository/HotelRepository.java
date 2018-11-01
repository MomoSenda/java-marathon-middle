package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.Hotel;

@Repository
@Transactional
public class HotelRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<Hotel> HOTELROWMAPPER = (rs, i) -> {
		Hotel hotel = new Hotel();
		hotel.setId(rs.getInt("id"));
		hotel.setAreaName(rs.getString("area_name"));
		hotel.setHotelName(rs.getString("hotel_name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNearestStation(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setParking(rs.getString("parking"));

		return hotel;
	};

	public List<Hotel> findByCheaperPrice(int price) {
		String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels WHERE price<=:price ORDER BY hotel_name";

		SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);

		List<Hotel> hotelList = template.query(sql, param, HOTELROWMAPPER);
		return hotelList;
	}
}
