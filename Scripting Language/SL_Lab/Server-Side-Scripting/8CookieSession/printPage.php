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
    // Echo session variables that were set on previous page
    echo "<h2>Value from next page</h2>";
    echo "<h2>Color is " . $_SESSION["color"] . "</h2>";
    echo "<h2>Border color is " . $_SESSION["border"] . "</h2>";
?>
</body>
</html> 