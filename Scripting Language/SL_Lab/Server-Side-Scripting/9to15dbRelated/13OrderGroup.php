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
                $sql = "SELECT product_name, price FROM products order BY price";

                $result = $conn->query($sql);
                echo "<h2 style='text-decoration: underline;'>Ordered by price</h2>";
                if ($conn->query($sql)) {
                    while ($row = $result->fetch_assoc()) {
                      echo "<h4>". $row['product_name']. " - ". $row['price']. "</h4>";
                }
                } else {
                    echo "Error: " . $sql . "<br>" . $conn->error;
                }
                $sql = "SELECT count(category_id), category_id FROM products group BY category_id";
                $result = $conn->query($sql);
                echo "<h2 style='text-decoration: underline;'>Group By Category_Id</h2>";
                    if ($conn->query($sql)) {
                        $count = 0;
                        while ($row = $result->fetch_assoc()) {
                            foreach ($row as $key => $value) {
                               $count++;
                               if($count%2==0){
                                echo  $key. " ".  $value. "</h4>";
                               }else{
                                echo  "<h4> No Of Items = " .  $value. " -> ";
                               }
                            }
                        }
                    }else {
                    echo "Error: " . $sql . "<br>" . $conn->error;
                }
            $conn->close();
            ?>
        </div>
</body>
</html>