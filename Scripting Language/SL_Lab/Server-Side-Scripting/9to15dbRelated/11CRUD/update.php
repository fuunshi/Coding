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
        <h2>Only firstName and lastName can be changed</h2>
        <form action="" method="post">
            <label for="column">Enter column name to change</label>
            <input type="text" name="column" id="column">
            <label for="oldValue">Enter the old value:</label>
            <input type="text" name="oldValue" id="oldValue">
            <label for="newValue">Enter new Value</label>
            <input type="text" name="newValue" id="newValue">
            <button name='submitBtn'>Update</button>
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
        $fieldName = $_POST['column'];
        $oldValue = $_POST['oldValue'];
        $newValue = $_POST['newValue'];
        
        $sql = "UPDATE students SET $fieldName='$newValue' WHERE $fieldName='$oldValue'";

        if ($conn->query($sql)) {
            echo "<h2>Update Successful</h2>";
        } else {
            echo "Error: " . $sql . "<br>" . $conn->error;
        }
    }
    $conn->close();
?> 