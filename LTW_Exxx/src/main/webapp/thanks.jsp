<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
 	<title>TDOU WEB</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for joining our email list</h1>

    <p>Here is the information that you entered:</p>

    <label>First Name:</label>
    <span>${user.firstName}</span><br>
    
    <label>Last Name:</label>
    <span>${user.lastName}</span><br>
    
   	<label>Email:</label>
    <span>${user.email}</span><br>
    
    <label>Date of Birth:</label>
    <span>${user.date}</span><br>
    
    <h2>Survey Responses</h2>
    
    <label>Heard from:</label>
    <span>${user.heardFrom}</span><br>
    
    <label>Wants updates:</label>
    <span>${user.wantUpdates}</span><br>
    
    <label>Announcements:</label>
    <span>${user.sendAnnouncements}</span><br>
    
    <label>Contact method:</label>
    <span>${user.contactVia}</span><br><br>

    <p>To enter another email address, click on the Back
       button in your browser or the Return button shown
       below.</p>

    <form action="" method="post">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return" id ="submit">
    </form>
</body>
</html>