 <!DOCTYPE html>
 <html lang="en">
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
 </head>
 <body>
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
        <form action="" method="post">
            <label for="firstName">Enter first name:</label>
            <input type="text" name="firstName" id="firstName">
            <label for="lastName">Enter last name</label>
            <input type="text" name="lastName" id="lastName">
            <label for="rollNo">Roll No</label>
            <input type="number" name="rollNo" id="rollNo" min='1' max='100'/>
            <button name='submitBtn'>Insert</button>
        </form> 
 </body>
 </html>
 <?php
    include '../../common.php';
    include '../dbconnect.php';

    if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
    }
    if(isset($_POST['submitBtn'])){
        $firstName = $_POST['firstName'];
        $lastName = $_POST['lastName'];
        $rollNo = $_POST['rollNo'];
        
        $sql = "INSERT INTO students (firstName, lastName, rollNo)
                VALUES ('$firstName', '$lastName', $rollNo)";

        if ($conn->query($sql)) {
            echo "<h2>Inserted data successfully</h2>";
        } else {
            echo "Error: " . $sql . "<br>" . $conn->error;
        }
    }
    $conn->close();
?> 