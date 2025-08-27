<%@ page import="java.sql.*, master.utilities.ConnectionFactory" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account Details</title>
    <style>
        body { font-family: Arial; text-align: center; }
        table { margin: auto; border-collapse: collapse; width: 70%; }
        th, td { border: 1px solid black; padding: 8px; }
        th { background: #f2f2f2; }
        .msg { color: green; font-weight: bold; margin: 20px; font-size:40px}
           .back {
    position: fixed;
    top: 0;
    right: 0;
    padding: 10px;
    z-index: 1000;
}

.back a svg {
    width: 30px; 
    height: 30px;
    color: #091834; 
    transition: transform 0.2s ease-in-out;
}

.back a svg:hover {
    transform: scale(1.1); 
    color: #609CE1; 
}
        
      
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
</head>
<body>

    <!-- ✅ show message -->
    <%
        String msg = (String)request.getAttribute("msg");
        if(msg != null){
    %>
        <div class="msg"><%= msg %></div>
    <% } %>
  <div class="back"><a href="AccountMain.jsp"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-left-circle" viewBox="0 0 16 16">
  <path fill-rule="evenodd" d="M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8m15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0m-4.5-.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5z"/>
</svg></a></div>
   
    <h2>Account List</h2>

    <table class="table table-hover table-striped table-bordered">
        <thead class="table-dark">
        <tr>
            <th>ACCOUNT NUMBER</th>
            <th>ACCOUNT TYPE</th>
            <th>OPEN DATE</th>
            <th>BALANCE</th>
            <th>CID</th>
            </tr>
            
        </thead>

        <%
            Connection cn = null;
            Statement st = null;
            ResultSet rs = null;
            try {
            	ConnectionFactory con=new ConnectionFactory();
                cn = con.getConn();
                st = cn.createStatement();
                rs = st.executeQuery("SELECT * FROM account");

                while(rs.next()){
        %>
            <tr>
                <td><%= rs.getInt("accno") %></td>
                <td><%= rs.getString("accounttype") %></td>
                <td><%= rs.getDate("opendate") %></td>
                <td><%= rs.getDouble("balance") %></td>
                <td><%= rs.getString("cid") %></td>
            </tr>
        <%
                }
            } catch(Exception e){
                out.println("Error: " + e.getMessage());
            } finally {
                try { if(rs != null) rs.close(); } catch(Exception e){}
                try { if(st != null) st.close(); } catch(Exception e){}
                try { if(cn != null) cn.close(); } catch(Exception e){}
            }
        %>
    </table>

</body>
</html>
