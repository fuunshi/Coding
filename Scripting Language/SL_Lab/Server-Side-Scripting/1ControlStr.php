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
    <form action="" method="post">
        <label for="num">Enter a number(1-5)</label>
        <input type="number" name="num" id="num">
        <button name="submitBtn">Submit</button>
    </form>
</body>
</html>
<?php
    $nums = ['One', 'Two', 'Three', 'Four', 'Five'];
    echo "<h3>The numbers are:</h3><ul style='padding-left: 35rem;'>";
    foreach($nums as $x){
        echo "<li>$x</li>";
    }
    echo "</ul>"; 
    if(isset($_POST['submitBtn'])){
        $num = $_POST['num'];
        if($num>5){
            echo "<h2>Cannot be more than 5</h2>";
        }else{
            $result = "<h2>The num is ";
            switch($num){
                case '1'  : $result = $result. "One</h2>";
                break;
                case '2'  : $result = $result. "Two</h2>";
                break;
                case '3'  : $result = $result. "Three</h2>";
                break;
                case '4'  : $result = $result. "Four</h2>";
                break;
                case '5'  : $result = $result. "Five</h2>";
                break;
                default:
                $result = "<h2>Not a number</h2>";
            }
            echo $result;
        }
    }


?>