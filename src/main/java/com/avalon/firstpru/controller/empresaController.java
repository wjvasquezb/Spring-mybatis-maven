package com.avalon.firstpru.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.avalon.firstpru.DAO.empresaMapper;


@Controller @RequestMapping("/empresa")
public class empresaController {

	@Autowired
	empresaMapper mapper;
	
		@RequestMapping("/listaempresas")
		public String showListOfEmployees(Model model){
			System.out.println(mapper.getEmpresa());
			model.addAttribute("empresalista", mapper.getEmpresa());
			return "empresas";
		}
		
		
}
