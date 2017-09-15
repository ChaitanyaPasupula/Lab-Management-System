package com.lms.daointerfaces;

import com.lms.beans.BookDetails;
import java.sql.SQLException;



public interface BookDetailsDao {
	public abstract void addBook() throws ClassNotFoundException, SQLException;
	public abstract void updateBook(String bookId,String selectionAttribute,String selectionValue) throws ClassNotFoundException, SQLException;
	public abstract void deleteBook(String bookId) throws ClassNotFoundException, SQLException;

}
