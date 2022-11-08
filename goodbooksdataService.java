package net.codejava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class goodbooksdataService {

	@Autowired
	private goodbooksdataRepository repo;
	
	public List<goodbooksdata> listALL()
	{
		return repo.findAll();
		
	}
	
	public goodbooksdata get(Integer ISBN)
	{
		return repo.findById(ISBN).get();
		
	}
	public List<goodbooksdata> findByGenre(String book_genre)
	{
		return repo.findByGenre(book_genre);
	}
	
	public List<goodbooksdata> findTopSellers(Integer copies_sold)
	{
		return repo.findTopSellers(copies_sold);
	}
	public List<goodbooksdata> searchByRating(Enum Stars)
	{
		return repo.searchByRating(Stars);
	}
}
