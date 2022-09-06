# good-books-library
The source code contains all the features to implement a RESTful API for an online bookstore.

Features:

1 Book Browsing and Sorting
    
API Actions...
  * Retrieves a List of Books by Genre
 * Retrieves a List of Top Sellers (Top 10 books that have sold the most copied)
 * Retrieves a List of Books for a particular rating and higher
 * Retrieves a List of X Books at a time where X is an integer from a given position 
    in the overall recordset.

2 Profile Management

API Actions...
 * Creates a User with username(email), password and optional fields (name, 
    email address, home address)
 * Retrieves a User Object and its fields by their username
 * Updates the user and any of their fields except for mail
 * Creates a Credit Card that belongs to a User and Retrieve a list of cards for 
    that user

3 Shopping Cart

API Actions...
 * Creates a shopping cart instance for a user. Shopping cart must belong to a 
    user
 * Updates the shopping cart with a book.
 * Retrieves the list of book(s) in the shopping cart.
 * Deletes a book from the shopping cart instance for that user.

4 Book Details Users

API Actions...
 * An administrator is able to create a book with the book ISBN, book 
    name, book description, price, author, genre, publisher , year published and 
    copies sold
 * Retrieves a book’s details by the ISBN
  * An administrator is able to create an author with first name, last 
    name, biography and publisher
 * Retrieves a list of books associate with an author

5 Book Rating and Commenting

API Actions...
 * User is able to create a rating for a book by a user on a 5 star scale with a 
    datestamp
 * User is able to create a comment for a book by a user with a datestamp
 * User is able to retrieve a list of ratings and comments sorted by highest 
    rating 
 * User is able to retrieve the average rating for a book
