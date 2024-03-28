<?php
include 'common.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method='post'>
        <label for="name">Enter name</label>
        <input type="text" name="name" id="name">
        <label for="email">Email</label>
        <input type="email" name="email" id="email">
        <label for="password">Enter password</label>
        <input type="password" name="password" id="password">
        <button name='submitBtn'>Submit</button>
    </form>
    <?php
        if(isset($_POST['submitBtn'])){
        if(!strlen($_POST['name'])){
            echo '<h2>Name cannot be empty!</h2>';
            return;
        }
        if(!strlen($_POST['email'])){
            echo '<h2>Email cannot be empty!</h2>';
            return;
        }
        if(!strlen($_POST['password'])){
            echo '<h2>Password cannot be empty!</h2>';
            return;
        }
        echo "<h2>Name = ". $_POST['name']. "</h2>";
        echo "<h2>Email = ". $_POST['email']. "</h2>";
        echo "<h2>Password = ". $_POST['password']. "</h2>";      
    }
    ?>
</body>
</html>