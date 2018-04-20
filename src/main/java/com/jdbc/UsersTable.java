package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersTable {

	public static void insertUser(String userid,String password, String company,Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("insert into users (user,password,company) values (?,?,? )");
            stmt.setString(1, userid);
            stmt.setString(2, password);
            stmt.setString(3, company);
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
    }

	
	//updateOrder("john","new_pasword")
	public static void updatePwd(String uid,String pwd, Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("update users set password=? where user=?");
            stmt.setString(1, pwd);
            stmt.setString(2, uid);
            stmt.executeUpdate();
        }
        catch (SQLException e)
        {
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
     
    }
	

	public static void deleteUser(String delUid,Connection conn) throws  SQLException
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = conn.prepareStatement("delete from users where user=?");
            stmt.setString(1, delUid);
            int rowsupdated=stmt.executeUpdate();
        }
        catch (SQLException e)
        {
        	throw e;
        }
        finally
        {
            try{
            	stmt.close();} catch(SQLException s){}
        }
     
    }

	public static boolean getUsersByCopmany(String company,Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        boolean result=false;
        try
        {
        	stmt = conn.prepareStatement("select user from users where company=?");
            stmt.setString(1, company);
            resultSet = stmt.executeQuery();
            while (resultSet.next())
            {
            	System.out.println(resultSet.getString("user"));
            }
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occired");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
        }
        
        return result;
    }



	public static boolean validateLogin(String user_id,String password, Connection conn) throws SQLException 
    {
		//date="03/20/15"
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        String[] result=new String[2];
        
        try
        {
        	stmt = conn.prepareStatement("select user_id,password,is_Account_Locked from login where user_id=? and password=?");
        	stmt.setString(1, user_id);
        	stmt.setString(2, password);
            resultSet = stmt.executeQuery();
            if(resultSet.next())
            {
            	return true;
            }
            else
            {
            	return false;
            }
           /* if((user_id.equals(result[0])) && (password.equals(result[1])) && (result[2].equals("No"))) {
				
				return true;
			}
			else {
				
				return false;
			}
            */
        }
        catch (SQLException e)
        {
        	System.out.println("Exception occured");
        	e.printStackTrace();
            throw e;
        }
        finally
        {
        	try{
        		resultSet.close(); } catch(SQLException s){}
            try{
            	stmt.close();} catch(SQLException s){}
            
        }
        
    }

}
