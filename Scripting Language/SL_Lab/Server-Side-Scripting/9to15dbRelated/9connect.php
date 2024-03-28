<?php
    $server = "localhost";
    $username = "root";
    $password = "";
    $dbname = "sl";

    $conn = new mysqli($server, $username, $password, $dbname);
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }
    echo "<h2>Connected successfully</h2>";
?>