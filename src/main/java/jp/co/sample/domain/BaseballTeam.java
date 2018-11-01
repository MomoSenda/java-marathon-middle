package jp.co.sample.domain;

/**
 * プロ野球チームの情報を表すドメイン.
 * 
 * @author momo.senda
 *
 */
public class BaseballTeam {
	private Integer id;
	private String leagueName;
	private String teamName;
	private String headquarters;
	private String inauguration;
	private String history;

	public Integer getId() {
		return id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getInauguration() {
		return inauguration;
	}

	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "BaseballDomain [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquarters="
				+ headquarters + ", inauguration=" + inauguration + ", history=" + history + ", getId()=" + getId()
				+ ", getLeagueName()=" + getLeagueName() + ", getTeamName()=" + getTeamName() + ", getHeadquarters()="
				+ getHeadquarters() + ", getInauguration()=" + getInauguration() + ", getHistory()=" + getHistory()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
