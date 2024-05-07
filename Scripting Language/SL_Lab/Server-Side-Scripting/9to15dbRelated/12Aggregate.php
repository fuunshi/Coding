<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table>
            <caption>The Data in Products table</caption>
        <?php
                include 'dbconnect.php';
                include '../common.php';
                 $sql = "select product_name, price, category_id from products;";

            $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            // output data of each row
            echo "<tr><th>Product Name</th><th>Price</th><th>Category</th></tr>";
            while($row = $result->fetch_assoc()) {
                echo "<tr><td>". $row["product_name"]. "</td><td>". $row["price"]. "</td><td>" . $row["category_id"] . "</td></tr>";
            }            
            } else {
                echo "<h2>No results</h2>";
            }
            $conn->close();
        ?>
        </table>
        <div class="container">
            <?php
                include 'dbconnect.php';
                $sql = "SELECT COUNT(*) as 'Total Products', SUM(price) as 'Sum of Price', ROUND(AVG(price)) as 'Average Price' FROM Products;";
                $result = $conn->query($sql);
                while ($row = $result->fetch_assoc()) {
                    // echo implode(" ", $row);
                    foreach($row as $x=>$y){
                        echo "<h2>". $x. " = ". $y. "</h2>";
                    }
                }
            $conn->close();
            ?>
        </div>
</body>
</html>