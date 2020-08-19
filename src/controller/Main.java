package controller;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.TeamDAO;
import model.Team;

public class Main {
	
	public static void main(String args[]) throws SQLException, Exception  {
		
		TeamDAO t1=new TeamDAO();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name=br.readLine();
		System.out.println("enter coach");
		String coach=br.readLine();
		System.out.println("enter city");
		String city=br.readLine();
		Team team=new Team(name, coach, city);
		t1.createTeam(team);
		
	}
	}
