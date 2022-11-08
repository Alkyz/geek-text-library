package net.codejava.bookbrowsing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class book_detailsService {

	@Autowired
	private book_detailsRepository repo;
	

	public List<book_details> listALL()
	{
		return repo.findAll();
		
	}
	 public void save(book_details goodbooksdata) {
		 repo.save(goodbooksdata);
	 }
	
	 public book_details get(Integer ISBN) {
		 return repo.findById(ISBN).get();
	 }

	public List<book_details> findByBook_genre(String genre)
	{
		return repo.findByBook_genre(genre);
	}
	public List<book_details> findByTopSellers(Integer TopSellers){
		return repo.findByTopSellers(TopSellers);
	}
	public List<book_details> getBook(int ISBN,String book_name,String book_description){
		return repo.getBook(ISBN, book_name, book_description);
	}
	
	public List<book_details> gettopten(Integer copiesSold){
		return repo.gettopten(copiesSold);
	}
	public List<book_details> findByStars(Integer Stars)
	{
		return repo.findByStars(Stars);
	}
}
