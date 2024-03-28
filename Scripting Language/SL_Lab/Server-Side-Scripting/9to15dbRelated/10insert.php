 <?php
    include '../common.php';
    include 'dbconnect.php';

    if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
    }

// sql to create table
    $sql = "CREATE TABLE students (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        firstname VARCHAR(30) NOT NULL,
        lastname VARCHAR(30) NOT NULL,
        rollno INT(4) not null
    )";

    if ($conn->query($sql)) {
        echo "<h2>Table MyGuests created successfully</h2>";
       // Now the insertion
        $sql = "INSERT INTO students (firstName, lastName, rollNo)
                VALUES ('Jivan', 'kadel', '11')";

        if ($conn->query($sql)) {
            echo "<h2>Inserted data successfully</h2>";
        } else {
            echo "Error: " . $sql . "<br>" . $conn->error;
        }
    } else {
        echo "Error creating table: " . $conn->error;
    }
    $conn->close();
?> 