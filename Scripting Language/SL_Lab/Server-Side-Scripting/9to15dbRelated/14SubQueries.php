<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
        <div class="container">
            <?php
                include 'dbconnect.php';
                include '../common.php';
                $sql = "SELECT product_name FROM products WHERE 
                category_id IN (SELECT category_id FROM category WHERE category_name = 'sports');";
                $result = $conn->query($sql);
                echo "<h2>The items with category name = sports</h2>";
                while ($row = $result->fetch_assoc()) {
                    //  echo implode(" ", $row);
                    foreach($row as $x=>$y){
                        echo "<h2>". $x. " = ". $y. "</h2>";
                    }
                }
            $conn->close();
            ?>
        </div>
</body>
</html>