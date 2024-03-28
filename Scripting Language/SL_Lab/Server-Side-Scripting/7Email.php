<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <label for="address">Enter email address</label>
        <input type="email" name="address" id="address">
        <label for="subject">Enter the subject</label>
        <input type="text" name="subject" id="subject">
        <label for="message">Enter the message</label>
        <textarea name="message" id="message" cols="30" rows="4"></textarea>
        <button name='submitBtn'>Send</button>
    </form>
</body>
</html>
 <?php

 // Program works but needs email server installed, check stackOverflow

 include 'common.php';
 if(isset($_POST['submitBtn'])){
    if(isset($_POST['address'])){

        // the message
        $email = $_POST['address'];
        $sub = $_POST['subject'];
        $msg = $_POST['message'];
        
        // use wordwrap() if 70 char+
        $msg = wordwrap($msg,70);
        
        // send email
        mail($email, $sub, $msg);
    }
 }
?> 