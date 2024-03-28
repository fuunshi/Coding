<?php
    include 'navigation.php';
    include 'navCss.php';
    echo "<br/>";
    echo "<h2>You can have multiple includes / requires</h2>";
    echo "<br/>";
    require 'navigation.php';
?>