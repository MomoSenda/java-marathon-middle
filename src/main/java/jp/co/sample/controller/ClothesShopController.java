package jp.co.sample.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.ClothesShop;
import jp.co.sample.form.ClothesShopForm;
import jp.co.sample.service.ClothesShopService;

/**
 * 性別と洋服の色を指定して、該当の洋服を表示するコントローラ.
 * 
 * @author momo.senda
 *
 */
@Controller
@RequestMapping("/clothesShop")
public class ClothesShopController {

	@Autowired
	private ClothesShopService service;

	@ModelAttribute
	public ClothesShopForm setUpform() {
		return new ClothesShopForm();
	}

	/**
	 * 検索画面を表示する.
	 * 
	 * @param model モデル
	 * @return
	 */
	@RequestMapping("/")
	public String index(Model model) {
		Map<String, String> clothesColorMap = new LinkedHashMap<>();
		clothesColorMap.put("赤", "赤");
		clothesColorMap.put("白", "白");
		clothesColorMap.put("青", "青");
		clothesColorMap.put("黄色", "黄色");

		model.addAttribute("clothesColorMap", clothesColorMap);
		return "clothesShop/shopInput";
	}

	/**
	 * 検索結果を表示する.
	 * 
	 * @param gender
	 *            性別
	 * @param color
	 *            色
	 * @param model
	 *            モデル
	 * @return 検索画面
	 */
	@RequestMapping("/clothesSearch")
	public String clothesSearch(ClothesShopForm clothesShopForm, Model model) {

		List<ClothesShop> clothesShopList = service.findByGenderAndColor(Integer.parseInt(clothesShopForm.getGender()),
				clothesShopForm.getColor());
		//System.out.println("clothesShopForm = " + clothesShopForm);
		//System.out.println("clothesShopList = " + clothesShopList);
		model.addAttribute("clothesShopList", clothesShopList);
		return index(model);
	}
}
