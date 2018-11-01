package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Hotel;
import jp.co.sample.service.HotelService;

/**
 * ホテルを検索して表示するコントローラ.
 * 
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService service;
	
	/**
	 * 検索画面を表示する
	 * 
	 * @return 検索画面
	 */
	@RequestMapping("/")
	public String index() {
		return "hotel/hotelInput";
	}
	
	
	
	/**
	 * 検索結果を表示する
	 * 
	 * @param model モデル
	 * @return
	 */
	@RequestMapping("/hotelSearch")
	public String list(int price,Model model) {
		List<Hotel> hotelList=service.findByCheaperPrice(price);
		
		//リクエストスコープに格納
		model.addAttribute("hotelList", hotelList);
		
		//フォワード
		return "hotel/hotelInput";
	}
	
	
}
