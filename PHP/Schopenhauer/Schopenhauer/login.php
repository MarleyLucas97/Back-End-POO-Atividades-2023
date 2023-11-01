<?php

require 'config.php';
require 'usuariodao.php';

$nome = $_POST['nome'];
$senha = $_POST['senha'];

print $nome."<br>".$senha;
?>