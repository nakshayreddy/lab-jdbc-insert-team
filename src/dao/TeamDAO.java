package dao;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO
{
	public void createTeam(Team team) throws SQLException, Exception
	{
		String name=team.getName();
		String coach=team.getCoach();
		String city=team.getCity();
//		ConnectionManager cm=new ConnectionManager();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("enter name");
//		String name=br.readLine();
//		System.out.println("enter coach");
//		String coach=br.readLine();
//		System.out.println("enter city");
//		String city=br.readLine();
		
		String sql="insert into TEAM(name,coach,city)VALUES(?,?,?)";
		PreparedStatement st=ConnectionManager.getConnection().prepareStatement(sql);
		
		st.setString(1,name);
		st.setString(2,coach);
		st.setString(3,city);
		
		int x=st.executeUpdate();
		System.out.println(x);
		
	}
}
