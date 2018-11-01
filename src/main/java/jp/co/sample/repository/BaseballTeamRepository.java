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

	public BaseballTeam load(Integer id) {
		String sql = "SELECT id, league_name,team_name,headquarters,inauguration,history "
				+ "FROM baseball_teams WHERE id=:id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		BaseballTeam baseball = template.queryForObject(sql, param, BASEBALLROWMAPPER);

		return baseball;

	}

	public List<BaseballTeam> findAll() {
		String sql = "SELECT id, league_name,team_name,headquarters,inauguration,history FROM baseball_teams ORDER BY team_name";

		List<BaseballTeam> baseballList = template.query(sql, BASEBALLROWMAPPER);
		return baseballList;
	}

}
