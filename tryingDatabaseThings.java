//SELECT column(s) FROM table WHERE column = value



//code for returning meetings for particular organization


public String[] populateMeetingsForOrganization(){
	List<String> meetingNames = new ArrayList<String>();
	List<String> meetingDeadlines = new ArrayList<String>();

	try{
		String query = "SELECT meetingName, deadline FROM Meeting WHERE idOrganization = ?"
		PreparedStatement prepStmt; 
		prepStmt = conn.prepareStatement(query);
		prepStmt.setString(1, "Spark");
		ResultSet resultSet = prepStmt.executeQuery();
      System.out.println("meeting names:");
      
      while (resultSet.next()) {
        String name = resultSet.getString("meetingName");
        String deadl = resultSet.getString("deadline");
        System.out.println("   "+name+" "+deadl);
        meetingNames.add(name);
        meetingDeadlines.add(deadl);
      }

      con.close(); 
	}
	catch(Exception e){
		system.out.pringln("hi, theres a problem");
		e.printStackTrace();
	}
	 
}