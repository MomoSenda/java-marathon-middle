package jp.co.sample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jp.co.sample.domain.BaseballTeam;

/**
 * 野球チームの詳細情報を表示するリポジトリ
 * @author momo.senda
 *
 */
@Repository
@Transactional
public class BaseballTeamRepository {
	@Autowired
	private NamedParameterJdbcTemplate template;

	private static final RowMapper<BaseballTeam> BASEBALLROWMAPPER = (rs, i) -> {
		BaseballTeam baseball = new BaseballTeam();
		baseball.setId(rs.getInt("id"));
		baseball.setLeagueName(rs.getString("league_name"));
		baseball.setTeamName(rs.getString("team_name"));
		baseball.setHeadquarters(rs.getString("headquarters"));
		baseball.setInauguration(rs.getString("inauguration"));
		baseball.setHistory(rs.getString("history"));
		return baseball;
	};

	/**
	 * 野球チームを1つ検索する
	 * 
	 * @param id　Id
	 * @return　野球チームの名前
	 */
	public BaseballTeam load(Integer id) {
		String sql = "SELECT id, league_name,team_name,headquarters,inauguration,history "
				+ "FROM baseball_teams WHERE id=:id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		BaseballTeam baseball = template.queryForObject(sql, param, BASEBALLROWMAPPER);

		return baseball;

	}

	/**
	 * 
	 * 該当の野球チームの情報をすべて表示する
	 * @return　野球チームんの詳細
	 */
	public List<BaseballTeam> findAll() {
		String sql = "SELECT id, league_name,team_name,headquarters,inauguration,history FROM baseball_teams ORDER BY team_name";

		List<BaseballTeam> baseballList = template.query(sql, BASEBALLROWMAPPER);
		return baseballList;
	}

}
