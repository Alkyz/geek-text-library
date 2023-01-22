package net.codejava.bookbrowsing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class book_detailsController {

	@Autowired
	private book_detailsService service;
	private book_detailsRepository repo;
	
	
	
	@GetMapping("/book_details")
	public List<book_details> list()
	{
		return service.listALL();
	}
	
	@GetMapping("/book_details/(ISBN)")
	public book_details get(@PathVariable Integer ISBN) {
		return service.get(ISBN);
	}
	
	@GetMapping("/book_details/book_genre/{book_genre}")
	public List<book_details> findByBook_genre(@PathVariable("book_genre") String book_genre)
	{
		return service.findByBook_genre(book_genre);
	}
	
	/*@GetMapping("/book_details/copiesSold/{copiesSold}")
	public List<book_details> findByTopSellers(@PathVariable("copiesSold") Integer copiesSold)
	{
		return service.findByTopSellers(copiesSold);
	}*/
	@RequestMapping(path = "/goodbooksdata/objectKey", method = RequestMethod.GET)
	public List<book_details> getBook(@RequestParam int ISBN, @RequestParam String book_name, @RequestParam String book_description) {
		return service.getBook(ISBN, book_name, book_description);
	}
	
	@GetMapping("/book_details/copiesSold/{copiesSold}")
	public List<book_details> gettopten(@PathVariable("copiesSold") Integer copiesSold){
		return service.gettopten(copiesSold);
	}
	@GetMapping("/ratings/Stars/{Stars}")
	public List<book_details> findByStars(@PathVariable("Stars")Integer Stars)
	{
		return service.findByStars(Stars);
	}
}
