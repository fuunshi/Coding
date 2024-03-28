<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="" method="post">
        <label for="texts">Enter text to write in file</label>
        <input type="text" name="texts" id="texts">
        <button name="writeBtn">Write File</button>
    </form>
</body>
</html>

<?php
    include '../common.php';
    if(isset($_POST['writeBtn'])){
        $texts = $_POST['texts'];
        if(strlen($texts)>0){
            $myFile = fopen('texts.txt', 'w') or die("Unable to open file!");;
            fwrite($myFile, $texts);
            fclose($myFile);
            $myFile = fopen("texts.txt", "r") or die("Unable to open file!");
            echo "<h2>". fread($myFile,filesize("texts.txt")). "</h2>";
            fclose($myFile);
        }else{
            echo "<h2>Please type something first!</h2>";
        }
    }

?>