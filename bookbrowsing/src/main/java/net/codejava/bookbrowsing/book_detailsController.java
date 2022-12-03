package net.codejava.bookbrowsing;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;



@RestController
public class book_detailsController {

	@Autowired
	private book_detailsRepository repo;
	//calls the repo methods
	
	
	@GetMapping("/goodbooksdata/book_details/book_genre/{book_genre}")
	//this is the call to be put into postman to get a list of books by genre
	public ResponseEntity<List<book_details>> getBookGenre(@PathVariable("book_genre") String book_genre) 
	{
        try {
            // gets the list of books by genre from goodbooksdata mysql database 
        	
            Optional<List<book_details>> genreobj = Optional.ofNullable(repo.findByGenre(book_genre));

            //check if genre exist in database
            if (genreobj.isPresent()) {
                return new ResponseEntity<List<book_details>>(genreobj.get(), HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    
	@GetMapping("/goodbooksdata/book_details/Stars/{Stars}")
	//this is the call to be put into postman to get a list of books by stars that are greater than or equal to the input
    public ResponseEntity<List<book_details>> getStars(@PathVariable("Stars") int Stars) {
        try {
            
           Optional<List<book_details>> starsobj = Optional.of(repo.findByStarsGreaterThanEqual(Stars));

            if (starsobj.isPresent()) {
               
                	return new ResponseEntity<List<book_details>>(starsobj.get(), HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
       }

    }
	
    @GetMapping("/goodbooksdata/book_details/pagination/sortby/{columnName}")
    //searches database to retrieve a list based on any column name
    public ResponseEntity<List<book_details>> getbookSelectionPageAcs(@PathVariable("columnName") String columnName) {
        try {

            Pageable pageRequest = PageRequest.of(0, 5, Sort.by(columnName).ascending());

            
            Optional<List<book_details>> bookObj = Optional.ofNullable(
                    repo.getbookSelectionPageAcsByCol(pageRequest)
                            .getContent());

            if (bookObj.isPresent()) {
                return new ResponseEntity<>(bookObj.get(), HttpStatus.OK);
            }

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
@GetMapping("/goodbooksdata/book_details/pagnition/sortby/{columnName}/{offset}/{limit}")
public ResponseEntity<List<book_details>> getLimitSelection(@PathVariable("columnName") String columnName, @PathVariable("offset") int offset, @PathVariable("limit")int limit) 
{
    try {
    	
    	Pageable pageRequest = PageRequest.of(offset, limit, Sort.by(columnName).ascending()); 
    	
        Optional<List<book_details>> limobj = Optional.ofNullable(repo.getLimitAndOffsetPageAcsByCol(pageRequest).getContent());

        //check if genre exist in database
        if (limobj.isPresent()) {
            return new ResponseEntity<>(limobj.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    }
 
    @GetMapping("/goodbooksdata/book_details/copiesSold")
    //retrieves a list of the top ten sellers 
    public ResponseEntity<List<book_details>> gettopten( Integer copiesSold) {
    	  try {
             
             Optional<List<book_details>> topTensobj = Optional.of(repo.findTopTenSellers(copiesSold));

              
              if (topTensobj.isPresent()) {
                 
                  	return new ResponseEntity<List<book_details>>(topTensobj.get(), HttpStatus.OK);
              }

              return new ResponseEntity<>(HttpStatus.NOT_FOUND);

          } catch (Exception e) {
              return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
         }
    	
    }
	
	
}
