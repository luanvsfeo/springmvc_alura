package br.com.casadocodigo.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.models.TipoPreco;

@Controller
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtodao;
	
	@RequestMapping("/produtos/form")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos",TipoPreco.values());	
		return modelAndView;
	}
	
	@RequestMapping(value="/produtos",method = RequestMethod.POST)
	public String gravar(Produto produto) {
		System.out.println(produto.toString());
		produtodao.gravar(produto);
		return "produtos/ok";
	}
	
	@RequestMapping(value="/produtos",method = RequestMethod.GET)
	public ModelAndView lista() {
		List<Produto> produtos =  produtodao.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos",produtos);
		
		return modelAndView;
	}
}
