<?php 
//vai receber o localhost...
$host = 'localhost';
//vai receber o banco...
$banco = 'schopenhauer';
//vai receber o usuario...
$user = 'root';
//vai receber a senha...
$pass = '';

try{
    $pdo = new PDO("mysql:ddname=".$banco.";host=".$host,$user,$pass);
//    print "como eh, amigo?";
}catch(Exception $e){
    die("morra: ".$e->getMessage()." deu ruim.");
}



/*$nome = 'killing';
$email = 'time@email.com';
$sql = $pdo->prepare("INSUinto usuario (nome,email) values (:nome,:email)");
$sql->bindParam(":nome",$nome);
$sql->bindParam(":email",$email);
$nome = 'novo nome';
$sql->execute();*/
?>