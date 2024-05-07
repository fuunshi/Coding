<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
        <table>
            <caption>The Data from Products + Category table</caption>
            <?php
                include 'dbconnect.php';
                include '../common.php';
                $sql = "SELECT product_name, price, products.category_id, category_name FROM products natural join category;";
            $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            // output data of each row
            echo "<tr><th>Product Name</th><th>Price</th><th>Category ID</th><th>Category Name</th></tr>";
            while($row = $result->fetch_assoc()) {
                echo "<tr><td>". $row["product_name"]. "</td><td>". $row["price"]. "</td><td>" . $row["category_id"] . "</td><td>" . $row["category_name"] . "</td></tr>";
            }
            } else {
                echo "<h2>No results</h2>";
            }
            $conn->close();
            ?>
        </table>
</body>
</html>