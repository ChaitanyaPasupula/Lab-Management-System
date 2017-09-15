package com.lms.daointerfaces;




import java.sql.SQLException;
import java.util.List;


public interface StatusReportDao {

	public abstract List generateStatusReport() throws ClassNotFoundException, SQLException;
}
