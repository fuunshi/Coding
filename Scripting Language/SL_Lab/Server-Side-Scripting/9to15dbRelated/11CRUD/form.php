<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div class="container">
        <table>
            <caption>The Data in 'Students' Table</caption>
            <?php
                include '../dbconnect.php';
                include '../../common.php';
                 $sql = "select firstName, lastName, rollNo from students;";

            $result = $conn->query($sql);

        if ($result->num_rows > 0) {
            // output data of each row
            echo "<tr><th>First Name</th><th>Last Name</th><th>Roll No</th></tr>";
            while($row = $result->fetch_assoc()) {
                echo "<tr><td>". $row["firstName"]. "</td><td>". $row["lastName"]. "</td><td>" . $row["rollNo"] . "</td></tr>";
            }
            } else {
                echo "<h2>No results</h2>";
            }
    $conn->close();
            ?>
        </table> 
            <form class='first' action="insert.php" method="post">
                <button>Insert</button>
            </form> 
            <form action="update.php" method="post">
                <button>Update</button>
            </form> 
            <form action="delete.php" method="post">
                <button>Delete</button>
            </form> 
        
    </div>
    <style>
        form{
            border: none;
            margin-top: 0;
            margin-bottom: 0;
        }
        form.first{
            margin-top: 2rem;
        }
    </style>
</body>
</html>