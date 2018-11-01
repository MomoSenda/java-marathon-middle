package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.BaseballTeam;
import jp.co.sample.service.BaseballTeamService;

/**
 * プロ野球チームの詳細情報を表示するコントローラ.
 * 
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/baseballTeam")
public class BaseballTeamController {
	
	
	@Autowired
	private BaseballTeamService service;

	/**
	 * 入力画面を表示する.
	 * 
	 * @param model　モデル
	 * @return　入力画面
	 */
	@RequestMapping("/list")
	public String list(Model model) {
		List<BaseballTeam> baseballTeamsList = service.findAll();

		// リクエストスコープに格納
		model.addAttribute("baseballTeamsList", baseballTeamsList);

		// フォワード
		return "baseballTeamInput";
	}

	/**
	 * 
	 * プロ野球チームの詳細情報を表示する.
	 * 
	 * @param id プロ野球チームのid
	 * @param model　モデル
	 * @return　出力画面
	 */
	@RequestMapping("/detail")
	public String detail(int id,Model model) {
		BaseballTeam baseballteam=service.load(id);
		
		model.addAttribute("baseballteam", baseballteam);
		
		return "baseballTeamInfo";
	}

}
