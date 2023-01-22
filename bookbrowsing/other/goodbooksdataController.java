package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class goodbooksdataController {

	@Autowired
	private goodbooksdataService service;
	
	
	@GetMapping("/goodbooksdata")
	public List<goodbooksdata> list()
	{
		return service.listALL();
	}
	@GetMapping("/goodbooksdata/genres/{genre}")
	public List<goodbooksdata> findByGenre(@PathVariable("genre") String book_genre)
	{
		return service.findByGenre(book_genre);
	}
	@GetMapping("/goodbooksdata/top seller/{top seller}")
	public List<goodbooksdata> findTopSellers(@PathVariable("top seller") Integer copies_sold)
	{
		return service.findTopSellers(copies_sold);
	}
	
	@GetMapping("/goodbooksdata/ratings/{Stars}")
	public List<goodbooksdata> searchByRating(@PathVariable("Stars") Enum Stars)
	{
		return service.searchByRating(Stars);
	}
	
	
} 
