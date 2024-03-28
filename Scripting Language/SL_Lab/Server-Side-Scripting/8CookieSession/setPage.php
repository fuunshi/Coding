<?php
    session_start();
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    include '../common.php';
    $cookie_name = "cantSeeMe";
    $cookie_value = "John Cena";
    setcookie($cookie_name, $cookie_value, time() + (86400 * 30), "/"); // 86400 = 1 day
    if(!isset($_COOKIE[$cookie_name])) {
        echo "Cookie named '" . $cookie_name . "' is not set!";
    } else {
        echo "<h2>Cookie '" . $cookie_name . "' is set!</h2>";
        echo "<h2>Value is: " . $_COOKIE[$cookie_name]. "</h2>";
    }
        // Set session variables
        $_SESSION["color"] = "red";
        $_SESSION["border"] = "black";
        echo "<h2>Session variables are set.</h2>";
    ?>
</body>
</html>